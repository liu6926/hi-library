package org.robot.hi.library.app

import android.app.Application
import com.google.gson.Gson
import org.robot.hi.library.log.HiConsolePrinter
import org.robot.hi.library.log.HiLogConfig
import org.robot.hi.library.log.HiLogManager

/**
 * @author mr.liuzhen@outlook.com (liu zhen)
 **/
class MyApplication :Application() {
    override fun onCreate() {
        super.onCreate()
        HiLogManager.init(object :HiLogConfig() {
            override fun injectJsonParser(): JsonParser {
                return JsonParser { src -> Gson().toJson(src) }
            }
            override fun getGlobaTag(): String {
                return "MyApplication"
            }

            override fun enable(): Boolean {
                return true
            }
        }, HiConsolePrinter())
    }
}