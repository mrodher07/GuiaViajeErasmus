package www.iesmurgi.guiaviajeerasmus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import www.iesmurgi.guiaviajeerasmus.databinding.ActivityItemCiudadBinding

class ItemCiudadActivity : AppCompatActivity() {
    private lateinit var binding: ActivityItemCiudadBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityItemCiudadBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLugaresInteres.setOnClickListener {
            val intent = Intent(this, ActivityLugares::class.java)
            startActivity(intent)
        }

        binding.btnLugaresComida.setOnClickListener {
            val intent = Intent(this, ActivityComida::class.java)
            startActivity(intent)
        }

        binding.btnTransporte.setOnClickListener {
            val intent = Intent(this, ActivityTransporte::class.java)
            startActivity(intent)
        }
    }
}