package perloti.com.br.mytoastlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import perloti.com.br.mytoastlibrary2.toasLongCustom

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val message = "My first Library"

        message.toasLongCustom()


    }


}
