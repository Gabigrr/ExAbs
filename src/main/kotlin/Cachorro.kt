

class Cachorro (nome: String, idade: Int, val raca: String)
    : Animal(nome, idade) {

        override fun tipoSom (){
            println ("au au au")
        }
        fun correr () {
            println("Correndo rápido como cachorro.")
        }

}
