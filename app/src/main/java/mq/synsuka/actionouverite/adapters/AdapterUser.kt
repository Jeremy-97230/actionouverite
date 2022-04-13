package mq.synsuka.actionouverite.adapters

import android.content.Context
import android.graphics.drawable.BitmapDrawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import mq.synsuka.actionouverite.R
import mq.synsuka.actionouverite.data.User

class AdapterUser (private var dataSet: ArrayList<User>):RecyclerView.Adapter<AdapterUser.ViewHolder>(){

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView
        val sexImage: ImageView
        val btnClose: ImageView

        init {
            // Define click listener for the ViewHolder's View.
            textView = view.findViewById(R.id.v_item_textName)
            sexImage = view.findViewById(R.id.v_item_imgSex)
            btnClose = view.findViewById(R.id.v_item_btnClose)
        }
    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.itemuser, viewGroup, false)

        return ViewHolder(view)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        var tempImage: Int
        if (dataSet[position].sex){
            tempImage = R.drawable.sex_male
        }else{
            tempImage = R.drawable.sex_female
        }

        viewHolder.btnClose.setOnClickListener {
            dataSet.removeAt(position)
            notifyDataSetChanged()
        }

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        viewHolder.textView.text = dataSet[position].name
        viewHolder.sexImage.setImageResource(tempImage)
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = dataSet.size
}