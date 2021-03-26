package tw.edu.pu.csim.tcyang.counter20210319

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var counter:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txv.text = counter.toString()
    }


    fun Add(v:View){
        //if (v.id == R.id.btn){
         if (v == btn){
            counter++
        }
        else{
            counter += 2
        }
        txv.text = counter.toString()
    }


}