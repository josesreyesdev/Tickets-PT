import java.time.LocalDate
import java.time.LocalDateTime

fun main() {

    // estructura de datos
    val listTickets = mutableListOf<Ticket>()

    // creo los tickets
    val ticket1 = Ticket(
        numero = 12, fila = 2, asiento = 3, precio = 1500.0,
        fechaCompra = LocalDateTime.now(),
        fechaValidez = LocalDate.now()
    )

    val ticket2 = Ticket(
        13, 2, 4, 1500.0, LocalDateTime.now(), LocalDate.now()
    )
    val ticket3 = Ticket(
        20, 5, 1, 2300.0, LocalDateTime.now(), LocalDate.now()
    )

    // agrego elementos a la lista
    listTickets.add(ticket1)
    listTickets.add(ticket2)
    listTickets.add(ticket3)

    // suma de precios
    var suma = 0.0
    listTickets.forEach { suma += it.precio}
    println("Suma de precios: $suma")

    // Pedir fila al usuario
    println()
    print("Ingresa la fila que desea ver el/los ticket(s): ")
    val fila = readlnOrNull()?.toInt()

    var filaEncontrada = false
    for (ticket in listTickets) {
        if (ticket.fila == fila) {
            println(ticket.toString())
            filaEncontrada = true
        }
    }
    if (!filaEncontrada) {
        println("No hay datos de la fila: $fila")
    }

    // Prueba de cliente
    val cliente1 = Cliente(1, "", "Jose", "S. Reyes", mutableListOf(ticket1))

    val ticket4 = Ticket(
        12, 4, 6, 2000.0, LocalDateTime.of(2023, 10, 12, 10, 25), LocalDate.now()
    )
    cliente1.listaTickets.add(ticket4)

    println()

    with(cliente1) {
        println("Lista de Tickets para: $nombre son: $listaTickets")
    }

}