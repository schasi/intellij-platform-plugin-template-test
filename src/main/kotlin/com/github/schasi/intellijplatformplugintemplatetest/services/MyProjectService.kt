package com.github.schasi.intellijplatformplugintemplatetest.services

import com.github.schasi.intellijplatformplugintemplatetest.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
