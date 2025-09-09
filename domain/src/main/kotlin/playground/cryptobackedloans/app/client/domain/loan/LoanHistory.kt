package playground.cryptobackedloans.app.client.domain.loan

import java.time.LocalDateTime

/**
 * 대출 상태 변화 히스토리
 */
class LoanHistory(
    val id: Long,
    val beforeStatus: LoanStatus,
    val afterStatus: LoanStatus,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime
) {
}