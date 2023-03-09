package www.iesmurgi.guiaviajeerasmus

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CiudadAdapter(private var listaCiudad: MutableList<Ciudad>,
                    private val OnItemDelete:(Int)->Unit,
                    private val OnItemUpdate:(Ciudad) -> Unit):RecyclerView.Adapter<CiudadViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CiudadViewHolder {
        val v= LayoutInflater.from(parent.context).inflate(R.layout.esqueleto_ciudades,parent,false)
        return CiudadViewHolder(v)
    }

    override fun onBindViewHolder(holder: CiudadViewHolder, position: Int) {
        holder.inflarDatos(listaCiudad[position], OnItemDelete, OnItemUpdate)
    }

    override fun getItemCount(): Int {
        return listaCiudad.size
    }

    fun deleteItem(i: Int) {
        listaCiudad.removeAt(i)
        notifyItemRemoved(i)
    }
}