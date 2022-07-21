package com.github.marcinaman.riderreproduer

import com.intellij.openapi.updateSettings.impl.UpdateSettings
import com.intellij.testFramework.LightPlatform4TestCase
import org.junit.Assert
import org.junit.Test

class Reproducer : LightPlatform4TestCase() {
    @Test
    fun `reproduce issue`(){
        val url = "sample"
        UpdateSettings.getInstance().storedPluginHosts.add(url)
        Assert.assertTrue(UpdateSettings.getInstance().storedPluginHosts.find { it.startsWith(url) } != null)
    }
}