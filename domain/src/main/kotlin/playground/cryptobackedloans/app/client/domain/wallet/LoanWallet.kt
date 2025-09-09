package playground.cryptobackedloans.app.client.domain.wallet

import playground.cryptobackedloans.domain.vo.Quantity
import java.time.LocalDateTime

/**
 * 대출금을 수령하는 지갑
 */
class LoanWallet(
    val id: Long,
    val cryptoCurrencyId: Long,
    val totalQuantity: Quantity,
    val pendingQuantity: Quantity,
    val availableQuantity: Quantity,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime
) {
}
