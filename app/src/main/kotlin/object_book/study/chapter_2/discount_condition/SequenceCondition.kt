package object_book.study.chapter_2.discount_condition

import object_book.study.chapter_2.Screening

class SequenceCondition(
    private val sequence: Int
) : DiscountCondition() {
    override fun isSatisfiedBy(screening: Screening): Boolean {
        return screening.isSequence(this.sequence)
    }
}