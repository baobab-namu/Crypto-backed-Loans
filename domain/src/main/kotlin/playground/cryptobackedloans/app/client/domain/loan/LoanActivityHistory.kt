package playground.cryptobackedloans.app.client.domain.loan

import java.time.LocalDateTime

/**
 * 대출 이용 내역
 */
class LoanActivityHistory(
    val id: Long,
    val type: LoanActivityHistoryType,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime
) {
}