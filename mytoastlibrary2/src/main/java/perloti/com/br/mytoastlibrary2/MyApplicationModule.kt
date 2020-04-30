package perloti.com.br.mytoastlibrary2

import android.app.Application
import android.content.Context

open class MyApplicationModule : Application() {

    companion object {
        lateinit var instance: MyApplicationModule
        val context: Context
            get() {
                return instance
            }
    }

    init {
        instance = this
    }


}