/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package object_book.study

import java.time.LocalDateTime

class Invitation(val time: LocalDateTime)

class Ticket(val fee: Long)

class Bag(
    private var invitation: Invitation?,
    private var ticket: Ticket?,
    private var amount: Long
) {

    fun holdTicketAndGetPaidAmount(ticket: Ticket): Long {
        return if (hasInvitation) {
            setTicket(ticket)
            0L
        } else {
            setTicket(ticket)
            minusAmount(ticket.fee)
            ticket.fee
        }
    }

    private val hasInvitation: Boolean
        get() = invitation != null

    private fun setTicket(ticket: Ticket?) {
        this.ticket = ticket
    }

    private fun minusAmount(amount: Long) {
        this.amount -= amount
    }

    private fun plusAmount(amount: Long) {
        this.amount += amount
    }
}

class Audience(private val bag: Bag) {
    fun buyTicketAndGetPaidAmount(ticket: Ticket): Long {
        return bag.holdTicketAndGetPaidAmount(ticket)
    }
}

class TicketOffice(
    private var amount: Long,
    private val tickets: MutableList<Ticket>
) {
    fun publishTicket(): Ticket {
        return tickets.removeFirst()
    }

    fun minusAmount(amount: Long) {
        this.amount -= amount
    }

    fun plusAmount(amount: Long) {
        this.amount += amount
    }
}

class TicketSeller(private val ticketOffice: TicketOffice) {
    fun sellTo(audience: Audience) {
        val ticket = ticketOffice.publishTicket()
        val paid = audience.buyTicketAndGetPaidAmount(ticket)
        ticketOffice.plusAmount(paid)
    }
}


class Theater(
    private val ticketSeller: TicketSeller
) {
    fun enter(audience: Audience) {
        ticketSeller.sellTo(audience)
    }
}