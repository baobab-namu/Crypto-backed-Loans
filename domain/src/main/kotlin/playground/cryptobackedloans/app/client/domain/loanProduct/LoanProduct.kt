package playground.cryptobackedloans.app.client.domain.loanProduct

import java.time.LocalDateTime

/**
 * 대출 상품
 */
class LoanProduct(
    val id: Long,
    val loanCryptoCurrencyId: Long,
    val quote: Quote,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime
) {
}