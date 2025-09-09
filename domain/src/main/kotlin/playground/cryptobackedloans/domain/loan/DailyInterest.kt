package playground.cryptobackedloans.domain.loan

import playground.cryptobackedloans.domain.common.vo.FiatPrice
import playground.cryptobackedloans.domain.common.vo.Quantity
import java.time.LocalDateTime

/**
 * 대출에 발생하는 일별 이자
 */
class DailyInterest(
    val id: Long,
    val quantity: Quantity,
    val krwPrice: FiatPrice,
    val usdPrice: FiatPrice,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime
) {
}