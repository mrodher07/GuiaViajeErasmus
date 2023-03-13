package www.iesmurgi.guiaviajeerasmus

import android.content.Intent
import android.graphics.BitmapFactory
import android.view.View
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import www.iesmurgi.guiaviajeerasmus.databinding.EsqueletoCiudadesBinding


class CiudadViewHolder (vista: View):RecyclerView.ViewHolder(vista) {
    private val binding = EsqueletoCiudadesBinding.bind(vista)
    fun inflarDatos(
        ciudad: Ciudad,
        onItemDelete: (Int) -> Unit,
        onItemUpdate: (Ciudad) -> Unit)
        {
            binding.btnBorrarCiudad.setOnClickListener {
                onItemDelete(adapterPosition)
            }

            itemView.setOnClickListener {
                val intent = Intent(itemView.context, ItemCiudadActivity::class.java)
                intent.putExtra("nombreCiudad", ciudad.ciudad)
                intent.putExtra("nombrePais", ciudad.pais)
                intent.putExtra("imagenCiudad", ciudad.imagenCiudad)
                ContextCompat.startActivity(itemView.context, intent, null)
            }

            binding.tvNombreCiudad.text = ciudad.ciudad.toString()
            binding.tvNombrePais.text = ciudad.pais.toString()
           // binding.ivImagenCiudad.setImageResource(ciudad.imagenCiudad.toInt())

            Glide.with(binding.tvNombreCiudad.context)
                .load(ciudad.imagenCiudad.toInt())
                .override(200, 200)
                .into(binding.ivImagenCiudad)


            binding.btnEditarCiudad.setOnClickListener{
                onItemUpdate(ciudad)
            }
        }
}