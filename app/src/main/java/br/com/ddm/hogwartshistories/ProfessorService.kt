package br.com.ddm.hogwartshistories

object ProfessorService {

    fun getProfessores (): List<Professor> {

        var professores = mutableListOf<Professor>()

        val d = Professor()
        d.nome = "Quirrell"
        d.foto = "https://static.wikia.nocookie.net/harrypotter/images/d/d2/Quirinus_Quirrell_PS_promo.jpg/revision/latest/scale-to-width-down/458?cb=20110806132643"
        professores.add(d)


        val c = Professor()
        c.nome = "Minerva McGonagall"
        c.foto = "https://static.wikia.nocookie.net/harrypotter/images/6/65/ProfessorMcGonagall-HBP.jpg/revision/latest?cb=20100612114856"
        professores.add(c)

        val e = Professor()
        e.nome = "Severo Snape"
        e.foto = "https://static.wikia.nocookie.net/harrypotter/images/a/a3/Severus_Snape.jpg/revision/latest?cb=20130106034225&path-prefix=pt-br"
        professores.add(e)

        return professores
    }
}