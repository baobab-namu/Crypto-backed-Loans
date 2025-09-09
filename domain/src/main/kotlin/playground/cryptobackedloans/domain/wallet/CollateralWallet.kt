package playground.cryptobackedloans.domain.wallet

import playground.cryptobackedloans.domain.vo.Quantity
import java.time.LocalDateTime

/**
 * 담보를 보내는 지갑
 */
class CollateralWallet(
    val id: Long,
    val cryptoCurrencyId: Long,
    val totalQuantity: Quantity,
    val pendingQuantity: Quantity,
    val availableQuantity: Quantity,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime
) {
}
