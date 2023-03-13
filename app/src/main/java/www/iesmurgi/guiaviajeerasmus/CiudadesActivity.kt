package www.iesmurgi.guiaviajeerasmus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import www.iesmurgi.guiaviajeerasmus.databinding.ActivityCiudadesBinding
import www.iesmurgi.guiaviajeerasmus.databinding.ActivityMainBinding

class CiudadesActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCiudadesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCiudadesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.floatingActionButton.setOnClickListener{
            val intent = Intent(this, AddCiudades::class.java)
            startActivity(intent)
        }
    }
}