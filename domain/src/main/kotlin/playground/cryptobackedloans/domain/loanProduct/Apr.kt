package playground.cryptobackedloans.domain.loanProduct

import playground.cryptobackedloans.domain.common.vo.Ltv
import playground.cryptobackedloans.domain.common.vo.Rate
import java.time.LocalDateTime

/**
 * 연 이율 (APR, Annual Percentage Rate)
 */
class Apr(
    val id: Long,
    val lowerBound: Ltv,
    val upperBound: Ltv,
    val rate: Rate,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime
) {
}