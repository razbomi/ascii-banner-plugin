package org.razbomi.plugin.banner.AsciiBannerStep

import lib.LayoutTagLib

l=namespace(LayoutTagLib)
t=namespace("/lib/hudson")
st=namespace("jelly:stapler")
f=namespace("lib/form")

// https://github.com/abayer/jenkins-hello-world-groovy-view-plugin
f.entry(title: "Text", field: "bannerText", description: "Banner text") {
    f.textbox()
}
