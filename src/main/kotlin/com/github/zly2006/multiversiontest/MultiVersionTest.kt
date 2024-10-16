package com.github.zly2006.multiversiontest

import com.github.zly2006.multiversiontest.interfaces.VersionSupplier
import net.fabricmc.api.ModInitializer

lateinit var versionSupplier: VersionSupplier

class MultiVersionTest : ModInitializer {
    override fun onInitialize() {
        try {
            Class.forName("com.github.zly2006.multiversiontest.init")
        } catch (e: ClassNotFoundException) {
            println("No init class found")
        }
        println("My version is " + versionSupplier.getVersion())
    }
}
