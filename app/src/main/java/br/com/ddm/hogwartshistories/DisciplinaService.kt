package br.com.ddm.hogwartshistories

object DisciplinaService {

    fun getDisciplinas (): List<Disciplina> {

        var disciplinas = mutableListOf<Disciplina>()

            val d = Disciplina()
            d.nome = "Defesa Contra Arte das Trevas"
            d.ementa = "Quirrel"
            d.professor = "Quirrell"
            d.foto = "https://static.wikia.nocookie.net/harrypotter/images/d/d2/Quirinus_Quirrell_PS_promo.jpg/revision/latest/scale-to-width-down/458?cb=20110806132643"
            disciplinas.add(d)

        return disciplinas
    }
}