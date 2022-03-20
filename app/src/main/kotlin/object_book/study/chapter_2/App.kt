package object_book.study.chapter_2

import object_book.study.chapter_2.discount_condition.PeriodCondition
import object_book.study.chapter_2.discount_condition.SequenceCondition
import object_book.study.chapter_2.discount_policy.AmountDiscountPolicy
import java.time.DayOfWeek
import java.time.Duration
import java.time.LocalTime

class Customer


fun main() {

    val avater = Movie(
        title = "아바타",
        runningTime = Duration.ofMinutes(120),
        fee = Money(10000),
        discountPolicy = AmountDiscountPolicy(
            conditions = listOf(
                SequenceCondition(1),
                SequenceCondition(10),
                PeriodCondition(DayOfWeek.FRIDAY, LocalTime.NOON, LocalTime.MIDNIGHT),
            ),
            discountAmount = Money(1000)
        )
    )

}