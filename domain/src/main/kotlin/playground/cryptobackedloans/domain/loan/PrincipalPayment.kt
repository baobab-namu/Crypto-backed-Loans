package playground.cryptobackedloans.domain.loan

import playground.cryptobackedloans.domain.vo.Quantity
import java.time.LocalDateTime

/**
 * 원금 납부
 */
class PrincipalPayment(
    val id: Long,
    val isPaid: Boolean,
    val quantity: Quantity,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime
) {
}