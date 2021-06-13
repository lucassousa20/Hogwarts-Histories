package br.com.ddm.hogwartshistories

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_detalhe_disciplina.*

class DetalheDisciplinaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhe_disciplina)

        val disciplina =  intent.extras?.getSerializable("disciplina") as Disciplina
        supportActionBar?.title = "${disciplina.nome}"
        var nome = disciplina.nome

    }
}