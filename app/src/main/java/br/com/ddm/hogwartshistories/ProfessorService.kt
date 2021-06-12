package br.com.ddm.hogwartshistories

object ProfessorService {

    fun getProfessores (): List<Professor> {

        var professores = mutableListOf<Professor>()

        val d = Professor()
        d.nome = "Quirrell"
        d.foto = "https://static.wikia.nocookie.net/harrypotter/images/d/d2/Quirinus_Quirrell_PS_promo.jpg/revision/latest/scale-to-width-down/458?cb=20110806132643"
        professores.add(d)

        return professores
    }
}