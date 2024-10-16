package com.github.zly2006.multiversiontest

class init {
    companion object {
        init {
            println("Init class loaded")

            versionSupplier = object : com.github.zly2006.multiversiontest.interfaces.VersionSupplier {
                override fun getVersion(): String {
                    return "1.20"
                }
            }
        }
    }
}
