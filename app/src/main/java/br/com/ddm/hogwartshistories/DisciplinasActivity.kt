package br.com.ddm.hogwartshistories

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.TokenWatcher
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_professores.*

class DisciplinasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_disciplinas)
        supportActionBar?.title = "Disciplinas"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        recycler_disciplinas?.layoutManager = LinearLayoutManager(this)
    }

    private var disciplinas = listOf<Disciplina>()

    override fun onResume() {
        super.onResume()
        disciplinas = DisciplinaService.getDisciplinas()
        recycler_disciplinas?.adapter = DisciplinaAdapter(disciplinas) {
            onClickDisciplina(it)
        }
    }

    fun onClickDisciplina (disciplina: Disciplina) {
        Toast.makeText(this, "Clicou", Toast.LENGTH_SHORT).show()
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if (id == android.R.id.home) {
            finish()
        }
        return super.onOptionsItemSelected(item)
    }
}