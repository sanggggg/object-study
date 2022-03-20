package object_book.study.chapter_2

import java.math.BigDecimal

class Money(
    private val amount: BigDecimal
) {

    constructor(amount: Long) : this(amount = BigDecimal(amount))
    constructor(amount: Double) : this(amount = BigDecimal.valueOf(amount))

    fun plus(amount: Money): Money {
        return Money(this.amount + amount.amount)
    }

    fun minus(amount: Money): Money {
        return Money(this.amount - amount.amount)
    }

    fun times(percent: Double): Money {
        return Money(this.amount.multiply(BigDecimal.valueOf(percent)))
    }

    fun isLessThan(other: Money): Boolean {
        return this.amount < other.amount
    }

    fun isGreaterThanOrEqual(other: Money): Boolean {
        return this.amount >= other.amount
    }

    companion object {
        val ZERO = Money(0)
    }
}