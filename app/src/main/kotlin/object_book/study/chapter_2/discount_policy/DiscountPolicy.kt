package object_book.study.chapter_2.discount_policy

import object_book.study.chapter_2.Money
import object_book.study.chapter_2.Screening
import object_book.study.chapter_2.discount_condition.DiscountCondition

abstract class DiscountPolicy(
    private val conditions: List<DiscountCondition>
) {
    fun calculateDiscountAmount(screening: Screening): Money {

        for (each in conditions) {
            if (each.isSatisfiedBy(screening)) {
                return getDiscountAmount(screening)
            }
        }
        return Money.ZERO

    }

    abstract fun getDiscountAmount(screening: Screening): Money
}
