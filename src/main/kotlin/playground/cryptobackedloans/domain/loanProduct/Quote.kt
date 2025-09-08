package playground.cryptobackedloans.domain.loanProduct

import org.hibernate.query.spi.Limit
import playground.cryptobackedloans.domain.common.vo.Ltv
import playground.cryptobackedloans.domain.common.vo.Quantity
import java.math.BigDecimal
import java.time.LocalDateTime

/**
 * 현재 담보/요청금액 기준의 금리·한도·수수료 제안.
 */
class Quote(
    val id: Long,
    val activationFee: BigDecimal, // 비율
    val aprs: List<Apr>,
    val maxLtv: Ltv,
    val marginCallThreshold: Ltv,
    val liquidationThreshold: Ltv,
    val loanLimit: Quantity,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime
) {
}