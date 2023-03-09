package www.iesmurgi.guiaviajeerasmus

import android.content.Intent
import android.view.View
import androidx.recyclerview.widget.RecyclerView
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
                intent.putExtra("imagenCiudad", ciudad.imagenCiudad)
            }
        }
}