package www.iesmurgi.guiaviajeerasmus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import www.iesmurgi.guiaviajeerasmus.databinding.ActivityCiudadesBinding

class CiudadesActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCiudadesBinding
    private lateinit var miAdapter: CiudadAdapter
    private var lista = listOf<Ciudad>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCiudadesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setRecycler()
        binding.floatingActionButton.setOnClickListener{
            val intent = Intent(this, AddCiudades::class.java)
            startActivity(intent)
        }
    }

    private fun setRecycler() {
        val datosRecyclerView = listOf<Ciudad>(
            Ciudad(1,
                "Dublin",
                "Irlanda",
                "Un pais muy bonito",
                "Las mejores vistas estan al lado del mar",
                "Se come muy bien", "Ingles e Irlandes", R.drawable.dublin_icon.toString(), R.drawable.dublin_lugares.toString(), R.drawable.dublin_comida.toString())

        )

        val layoutManager = LinearLayoutManager(this)
        binding.rvCiudades.layoutManager = layoutManager
        miAdapter = CiudadAdapter(datosRecyclerView, { onItemeDelete(it) }) { coche -> onItemUpdate(coche) }
        binding.rvCiudades.adapter = miAdapter
    }

    private fun onItemeDelete(position: Int) {
        val ciudad = lista[position]
        //borramos de la lista e indicamos al adapter que hemos
        lista.dropLast(position)
        miAdapter.notifyItemRemoved(position)
    }

    private fun onItemUpdate(ciudad: Ciudad) {
        val i = Intent(this, AddCiudades::class.java).apply {
            putExtra("CIUDAD", ciudad)
        }
        startActivity(i)
    }
}