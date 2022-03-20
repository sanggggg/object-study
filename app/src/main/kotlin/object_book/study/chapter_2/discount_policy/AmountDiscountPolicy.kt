package object_book.study.chapter_2.discount_policy

import object_book.study.chapter_2.Money
import object_book.study.chapter_2.Screening
import object_book.study.chapter_2.discount_condition.DiscountCondition

class AmountDiscountPolicy(
    conditions: List<DiscountCondition>,
    private val discountAmount: Money
) : DiscountPolicy(conditions) {

    override fun getDiscountAmount(screening: Screening): Money {
        return discountAmount
    }
}