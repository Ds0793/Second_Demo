package com.sabiai

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.sabiai.controler.CasesController
import com.sabiai.model.CovidData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class CasesActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var model : CovidData = getDataFromAPI()
        var view = CasesActivity()
        var controller = CasesController(model,view)

        GlobalScope.launch(Dispatchers.Main) {
            val movie = controller.apiRequest()
//            Toast.makeText(this@RecyclerViewMai///n,movie.toString(), Toast.LENGTH_LONG).show()
        }
    }

    private fun getDataFromAPI(): CovidData {
        return
    }
}