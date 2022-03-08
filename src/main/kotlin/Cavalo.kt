

class Cavalo (nome: String, idade: Int, raca: String)
    : Animal (nome, idade) {

    override fun tipoSom() {
        println("iiirrrrí rilinchin")
    }

    fun correr() {
        println("Correndo muito rápido como um cavalo")
    }

}
