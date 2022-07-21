package com.github.marcinaman.riderreproduer.services

import com.intellij.openapi.project.Project
import com.github.marcinaman.riderreproduer.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
