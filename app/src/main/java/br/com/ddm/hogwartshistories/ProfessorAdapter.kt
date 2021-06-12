package br.com.ddm.hogwartshistories

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class ProfessorAdapter (
    val professores: List<Professor>,
    val onClick: (Professor) -> Unit
): RecyclerView.Adapter<ProfessorAdapter.ProfessoresViewHolder>() {

    class ProfessoresViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val cardNome: TextView
        val cardImage: ImageView
        val cardProgress: ProgressBar
        val cardView: CardView

        init {
            cardNome = view.findViewById(R.id.card_nome)
            cardImage = view.findViewById(R.id.card_image)
            cardProgress = view.findViewById(R.id.card_progress)
            cardView = view.findViewById(R.id.card_professores
            )
        }
    }
    override fun getItemCount() = this.professores.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfessoresViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.adapter_professor, parent, false)

        val holder = ProfessoresViewHolder(view)

        return holder
    }

    override fun onBindViewHolder(holder: ProfessoresViewHolder, position: Int) {

        val professor = professores[position]

        holder.cardNome.text = professor.nome
        holder.cardProgress.visibility = View.VISIBLE

        val context = holder.itemView.context

        Picasso.with(context).load(professor.foto).fit().into(holder.cardImage,
            object: com.squareup.picasso.Callback {
                override fun onSuccess() {
                    holder.cardProgress.visibility = View.GONE
                }
                override fun onError() {
                    holder.cardImage.setImageResource(R.drawable.imagem_login)
                    holder.cardProgress.visibility = View.GONE
                }
            }
        )
        holder.itemView.setOnClickListener {onClick(professor)}
    }

}