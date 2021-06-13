package br.com.ddm.hogwartshistories

object DisciplinaService {

    fun getDisciplinas (): List<Disciplina> {

        var disciplinas = mutableListOf<Disciplina>()

            val d = Disciplina()
            d.nome = "Defesa Contra Arte das Trevas"
            d.ementa = "Defesa Contra as Artes das Trevas (às vezes escrita como D.C.A.T.) é uma matéria obrigatória na Escola de Magia e Bruxaria de Hogwarts, na qual os alunos aprendem como se defender magicamente contra Criaturas das Trevas e contra as Artes das Trevas."
            d.professor = "Quirrell"
            d.foto = "https://static.wikia.nocookie.net/harrypotter/images/d/d2/Quirinus_Quirrell_PS_promo.jpg/revision/latest/scale-to-width-down/458?cb=20110806132643"
            disciplinas.add(d)


        return disciplinas
    }
}