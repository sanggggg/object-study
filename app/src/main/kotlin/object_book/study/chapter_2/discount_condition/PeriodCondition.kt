package object_book.study.chapter_2.discount_condition

import object_book.study.chapter_2.Screening
import java.time.DayOfWeek
import java.time.LocalTime

class PeriodCondition(
    private val dayOfWeek: DayOfWeek,
    private val startTime: LocalTime,
    private val endTime: LocalTime,
) : DiscountCondition() {
    override fun isSatisfiedBy(screening: Screening): Boolean {
        return screening.getStartTime().dayOfWeek == this.dayOfWeek &&
                screening.getStartTime().toLocalTime() >= this.startTime &&
                screening.getStartTime().toLocalTime() <= this.endTime
    }
}