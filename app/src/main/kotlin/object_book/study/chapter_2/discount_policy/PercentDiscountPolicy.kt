package object_book.study.chapter_2.discount_policy

import object_book.study.chapter_2.Money
import object_book.study.chapter_2.Screening
import object_book.study.chapter_2.discount_condition.DiscountCondition

class PercentDiscountPolicy(
    conditions: List<DiscountCondition>,
    private val percent: Double
) : DiscountPolicy(conditions) {

    override fun getDiscountAmount(screening: Screening): Money {
        return screening.getMovieFee().times(this.percent)
    }
}