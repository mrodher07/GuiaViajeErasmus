package www.iesmurgi.guiaviajeerasmus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import www.iesmurgi.guiaviajeerasmus.databinding.ActivityComidaBinding

class ActivityComida : AppCompatActivity() {
    private lateinit var binding: ActivityComidaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityComidaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()

        binding.btnVolver.setOnClickListener {
            val intent = Intent(this, CiudadesActivity::class.java)
            startActivity(intent)
        }
    }


    fun init(){
        val bundle = intent
        binding.ivComida.setImageResource(bundle.getStringExtra("foto").toString().toInt())
        binding.tvInfo.text=bundle.getStringExtra("descripcion").toString()

    }
}