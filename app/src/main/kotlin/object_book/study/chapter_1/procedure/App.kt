package object_book.study.chapter_1.procedure

import java.time.LocalDate

// 코틀린 데이터 클래스를 structure 같은 문법으로 간주한다.
data class Invitation(
    var time: LocalDate
)

data class Ticket(
    var fee: Long
)

data class Bag(
    var invitation: Invitation, var ticket: Ticket?, var amount: Long
)

data class Audience(
    var bag: Bag
)

data class TicketOffice(
    var amount: Long, var tickets: MutableList<Ticket>
)

data class TicketSeller(
    var ticketOffice: TicketOffice
)

data class Theater(
    var ticketSeller: TicketSeller
)

fun theaterEnter(theater: Theater, audience: Audience) {
    sellerSellTo(theater.ticketSeller, audience)
}

fun sellerSellTo(seller: TicketSeller, audience: Audience) {
    // ...
}