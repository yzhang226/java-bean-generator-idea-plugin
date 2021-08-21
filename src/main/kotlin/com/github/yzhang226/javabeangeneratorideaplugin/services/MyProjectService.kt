package com.github.yzhang226.javabeangeneratorideaplugin.services

import com.github.yzhang226.javabeangeneratorideaplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
