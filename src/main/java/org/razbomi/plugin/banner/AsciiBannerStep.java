package org.razbomi.plugin.banner;

import hudson.Extension;
import hudson.FilePath;
import hudson.Launcher;
import hudson.model.AbstractProject;
import hudson.model.Run;
import hudson.model.TaskListener;
import hudson.tasks.BuildStepDescriptor;
import hudson.tasks.Builder;
import jenkins.tasks.SimpleBuildStep;
import net.sf.json.JSONObject;
import org.jenkinsci.Symbol;
import org.kohsuke.stapler.DataBoundConstructor;
import org.kohsuke.stapler.DataBoundSetter;
import org.kohsuke.stapler.StaplerRequest;

import javax.annotation.Nonnull;
import java.io.IOException;

public class AsciiBannerStep extends Builder implements SimpleBuildStep {
    private final String text;

    @DataBoundSetter
    private String colour; // TODO: Enum or hex for rgb

    @DataBoundSetter
    private String font; // TODO: config + some validation if the font is avail

    @DataBoundConstructor
    public AsciiBannerStep(@Nonnull String text) {
        this.text = text;
    }

    @Override
    public void perform(@Nonnull Run<?, ?> run, @Nonnull FilePath workspace, @Nonnull Launcher launcher, @Nonnull TaskListener listener) throws InterruptedException, IOException {
        listener.getLogger().println("text " + text);
        listener.getLogger().println("colour " + colour);
        listener.getLogger().println("font " + font);
    }

    @Symbol("banner")
    @Extension
    public static class Descriptor extends BuildStepDescriptor<Builder> {

        @Override
        public String getDisplayName() {
            return "Ascii Banner";
        }


        @Override
        public boolean isApplicable(Class<? extends AbstractProject> jobType) {
            return true;
        }

        @Override
        public boolean configure(StaplerRequest staplerRequest, JSONObject json) throws FormException {
            // to persist global configuration information,
            // set that to properties and call save().
//            useFrench = json.getBoolean("useFrench");
//            save();
            return true;
        }
    }

}
