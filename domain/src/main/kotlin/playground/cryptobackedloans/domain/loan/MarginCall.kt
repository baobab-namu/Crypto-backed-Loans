package playground.cryptobackedloans.domain.loan

import playground.cryptobackedloans.domain.vo.Ltv
import java.time.LocalDateTime

/**
 * 마진콜
 */
class MarginCall(
    val id: Long,
    val ltv: Ltv, // 마진콜 발동 시점의 ltv
    val createdAt: LocalDateTime,
    val releasedAt: LocalDateTime,
    val updatedAt: LocalDateTime
) {
}