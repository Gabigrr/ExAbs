fun main() {

    val fred = Cachorro("Fred", 10, "Vira-lata")
    val spirit = Cavalo("Spirit", 3, "Mustang")
    val nelson = BichoPreguica("Nelson", 6)


    println ("O som que o cachorro faz:")
    fred.tipoSom ()

    println ("O som que o cavalo faz:")
    spirit.tipoSom()

    println ("O som que a preguiça faz:")
    nelson.tipoSom()


}