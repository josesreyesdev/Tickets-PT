class Cliente(
    val id: Int,
    val dni: String,
    val nombre: String,
    val apellido: String,
    val listaTickets: MutableList<Ticket>  /*1 cliente contiene ~ tickets o OneToMany*/
)