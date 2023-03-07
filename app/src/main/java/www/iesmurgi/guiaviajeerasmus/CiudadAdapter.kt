package www.iesmurgi.guiaviajeerasmus

import androidx.recyclerview.widget.RecyclerView

class CiudadAdapter(private var listaCiudad: MutableList<Ciudad>,
                    private val OnItemDelete:(Int)->Unit,
                    private val OnItemUpdate:(Ciudad) -> Unit):RecyclerView.Adapter<CiudadViewHolder>() {
}