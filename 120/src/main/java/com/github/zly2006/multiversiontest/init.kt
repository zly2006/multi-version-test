package com.github.zly2006.multiversiontest

import net.minecraft.item.ItemStack

class init {
    companion object {
        init {
            println("Init class loaded")

            MultiVersionTest.versionSupplier = object : com.github.zly2006.multiversiontest.interfaces.VersionSupplier {
                override fun getVersion(): String {
                    return "1.20"
                }
            }
        }
    }
}
