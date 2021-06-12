package br.com.ddm.hogwartshistories

object DisciplinaService {

    fun getDisciplinas (): List<Disciplina> {

        var disciplinas = mutableListOf<Disciplina>()

        for (i in 1..10) {
            val d = Disciplina()
            d.nome = "Disciplina $i"
            d.ementa = "Ementa $i"
            d.professor = "Professor $i"
            d.foto = "Foto $i"
            disciplinas.add(d)
        }
        return disciplinas
    }
}