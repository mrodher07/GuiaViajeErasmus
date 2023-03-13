package www.iesmurgi.guiaviajeerasmus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import www.iesmurgi.guiaviajeerasmus.databinding.ActivityItemCiudadBinding
import www.iesmurgi.guiaviajeerasmus.databinding.ActivityLugaresBinding

class ActivityLugares : AppCompatActivity() {
    private lateinit var binding: ActivityLugaresBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLugaresBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()

        binding.btnVolver.setOnClickListener {
            val intent = Intent(this, CiudadesActivity::class.java)
            startActivity(intent)
        }
    }


    fun init(){
        val bundle = intent
        binding.ivLugares.setImageResource(bundle.getStringExtra("foto").toString().toInt())
        binding.tvDescripcion.text=bundle.getStringExtra("descripcion").toString()

    }
}