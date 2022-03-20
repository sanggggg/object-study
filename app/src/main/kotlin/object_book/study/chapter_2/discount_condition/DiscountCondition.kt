package object_book.study.chapter_2.discount_condition

import object_book.study.chapter_2.Screening

abstract class DiscountCondition {
    abstract fun isSatisfiedBy(screening: Screening): Boolean
}
