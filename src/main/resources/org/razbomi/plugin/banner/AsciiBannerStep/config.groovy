package org.razbomi.plugin.banner.AsciiBannerStep

import lib.LayoutTagLib

l=namespace(LayoutTagLib)
t=namespace("/lib/hudson")
st=namespace("jelly:stapler")
f=namespace("lib/form")

// https://github.com/abayer/jenkins-hello-world-groovy-view-plugin
f.entry(title: "Text", field: "text", description: "Banner text") {
    f.textbox()
}

f.entry(title: "Colour", field: "colour", description: "Banner colour") {
    f.textbox()
}

f.entry(title: "Font", field: "font", description: "Banner font") {
    f.textbox()
}
