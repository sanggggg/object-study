package object_book.study.chapter_2

class Reservation(
    private val customer: Customer,
    private val screeninng: Screening,
    private val fee: Money,
    private val audienceCount: Int
)