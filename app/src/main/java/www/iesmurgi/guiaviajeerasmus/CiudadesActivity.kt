package www.iesmurgi.guiaviajeerasmus

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
    }
}