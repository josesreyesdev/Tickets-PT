import java.time.LocalDate
import java.time.LocalDateTime

class Ticket(
    val numero: Int,
    val fila: Int,
    val asiento: Int,
    val precio: Double,
    val fechaCompra: LocalDateTime,
    val fechaValidez: LocalDate
) {
    override fun toString(): String {
        return "Ticket(numero=$numero, fila=$fila, asiento=$asiento, precio=$precio, fechaCompra=$fechaCompra, fechaValidez=$fechaValidez)"
    }
}