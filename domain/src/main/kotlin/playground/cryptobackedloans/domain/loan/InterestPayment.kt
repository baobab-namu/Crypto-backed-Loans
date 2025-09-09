package playground.cryptobackedloans.domain.loan

import playground.cryptobackedloans.domain.vo.Quantity
import java.time.LocalDateTime

/**
 * 월 이자 납부
 */
class InterestPayment(
    val id: Long,
    val isPaid: Boolean,
    val quantity: Quantity,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime
) {
}