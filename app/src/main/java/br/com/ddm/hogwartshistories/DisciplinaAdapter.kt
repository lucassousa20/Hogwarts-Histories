package br.com.ddm.hogwartshistories

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class DisciplinaAdapter (
    val disciplinas: List<Disciplina>,
    val onClick: (Disciplina) -> Unit
): RecyclerView.Adapter<DisciplinaAdapter.DisciplinaViewHolder>() {

    class DisciplinaViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val cardNome: TextView
        val cardImage: ImageView
        val cardProgress: ProgressBar
        val cardView: CardView

        init {
            cardNome = view.findViewById(R.id.card_nome)
            cardImage = view.findViewById(R.id.card_image)
            cardProgress = view.findViewById(R.id.card_progress)
            cardView = view.findViewById(R.id.card_disciplinas
            )
        }
    }

    override fun getItemCount() = this.disciplinas.size

    override fun onCreateViewHolder(parent: ViewGroup, ViewType: Int): DisciplinaViewHolder{
        val view = LayoutInflater.from(parent.context).inflate(R.layout.adapter_disciplina, parent, false)

        val holder = DisciplinaViewHolder(view)

        return holder
    }

    override fun onBindViewHolder(holder: DisciplinaViewHolder, position: Int) {

        val disciplina = disciplinas[position]

        holder.cardNome.text = disciplina.nome
        holder.cardProgress.visibility = View.VISIBLE
    }

}