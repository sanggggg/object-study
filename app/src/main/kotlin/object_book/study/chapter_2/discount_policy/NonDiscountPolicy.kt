package object_book.study.chapter_2.discount_policy

import object_book.study.chapter_2.Money
import object_book.study.chapter_2.Screening

class NonDiscountPolicy() : DiscountPolicy(emptyList()) {
    override fun getDiscountAmount(screening: Screening): Money {
        return Money.ZERO
    }

}