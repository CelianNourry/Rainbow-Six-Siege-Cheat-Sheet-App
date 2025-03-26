import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.recyclerview.widget.RecyclerView
import com.example.logicbomb.OperatorData
import com.example.logicbomb.R

class OperatorsIconAdapter(
    private val operatorDataList: List<OperatorData>,
    private val onButtonClick: (Int) -> Unit
) : RecyclerView.Adapter<OperatorsIconAdapter.ViewHolder>() {

    // ViewHolder
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageButton: ImageButton = itemView.findViewById(R.id.imageButton)

        init {
            imageButton.setOnClickListener {
                onButtonClick(adapterPosition)
            }
        }
    }

    // Création du ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.operator_icon, parent, false)
        return ViewHolder(view)
    }

    // Liaison des données
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val operatorData = operatorDataList[position]
        holder.imageButton.setImageResource(operatorData.imageResId)
        holder.imageButton.adjustViewBounds = false
    }

    override fun getItemCount(): Int = operatorDataList.size
}