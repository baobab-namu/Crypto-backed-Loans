package playground.cryptobackedloans.domain.transaction

import playground.cryptobackedloans.domain.vo.Quantity
import java.time.LocalDateTime

/**
 * 입/출금 거래
 */
class Transaction(
    val id: Long,
    val cryptoCurrencyId: Long,
    val userId: Long,
    val collateralWalletId: Long,
    val source: String,
    val quantity: Quantity,
    val networkFee: Quantity,
    val txId: String,
    val outputIndex: Int,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime
) {
}