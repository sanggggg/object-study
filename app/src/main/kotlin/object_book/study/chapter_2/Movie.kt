package object_book.study.chapter_2

import object_book.study.chapter_2.discount_policy.DiscountPolicy
import java.time.Duration

class Movie(
    private val title: String,
    private val runningTime: Duration,
    private val fee: Money,
    private val discountPolicy: DiscountPolicy
) {

    fun getFee(): Money = this.fee

    fun calculateMovieFee(screening: Screening): Money {
        return fee.minus(discountPolicy.calculateDiscountAmount(screening))
    }
}