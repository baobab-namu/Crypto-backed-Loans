package playground.cryptobackedloans.app.client.domain.loan

import playground.cryptobackedloans.domain.vo.Ltv
import playground.cryptobackedloans.domain.vo.Quantity
import java.time.LocalDateTime

/**
 * 청산
 * 발생 가능한 경우
 * - LTV 85% 이상 도달 (LTV 85% -> 75% 만큼 청산)
 * - 이자 3개월 이상 미납한 경우 (이자만큼 청산)
 * - 원금 납부 유예기간만큼 미납한 경우 (100% 청산)
 */
class Liquidation(
    val id: Long,
    val quantity: Quantity,
    val ltv: Ltv, // 청산 발동 시점의 ltv
    val type: LiquidationType,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime
) {
}