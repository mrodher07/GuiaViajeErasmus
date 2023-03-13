package www.iesmurgi.guiaviajeerasmus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import www.iesmurgi.guiaviajeerasmus.databinding.ActivityItemCiudadBinding

class ItemCiudadActivity : AppCompatActivity() {

    private var fotoLugar:String = ""
    private var descripcionLugar:String = ""
    private var fotoComida:String = ""
    private var infoComida:String = ""


    private lateinit var binding: ActivityItemCiudadBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityItemCiudadBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLugaresInteres.setOnClickListener {
            val intent = Intent(this, ActivityLugares::class.java).apply {
                putExtra("foto", fotoLugar)
                putExtra("descripcion", descripcionLugar)
            }
            startActivity(intent)
        }

        binding.btnLugaresComida.setOnClickListener {
            val intent = Intent(this, ActivityComida::class.java).apply {
                putExtra("foto", fotoComida)
                putExtra("descripcion", infoComida)
            }
            startActivity(intent)
        }

        binding.btnTransporte.setOnClickListener {
            val intent = Intent(this, ActivityTransporte::class.java)
            startActivity(intent)
        }
        init()
    }


    private fun init(){
        val bundle = intent
        binding.tvCiudadActual.text= bundle.getStringExtra("nombreCiudad")
        fotoLugar = bundle.getStringExtra("fotoLugar").toString()
        descripcionLugar = bundle.getStringExtra("descripcion").toString()
        fotoComida = bundle.getStringExtra("fotoComida").toString()
        infoComida = bundle.getStringExtra("infoComida").toString()
    }
}