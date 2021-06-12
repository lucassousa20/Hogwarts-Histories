package br.com.ddm.hogwartshistories

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_disciplinas.*
import kotlinx.android.synthetic.main.activity_professores.*

class ProfessoresActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_professores)
        supportActionBar?.title = "Professores"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        recycler_professores?.layoutManager = LinearLayoutManager(this)
    }

    private var professores = listOf<Professor>()

    override fun onResume() {
        super.onResume()
        professores = ProfessorService.getProfessores()
        recycler_professores?.adapter = ProfessorAdapter(professores) {

        }
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if (id == android.R.id.home) {
            finish()
        }
        return super.onOptionsItemSelected(item)
    }
}