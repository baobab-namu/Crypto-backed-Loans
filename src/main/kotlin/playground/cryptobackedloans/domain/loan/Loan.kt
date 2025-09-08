package playground.cryptobackedloans.domain.loan

import playground.cryptobackedloans.domain.common.vo.Quantity
import java.time.LocalDateTime

/**
 * 대출
 */
class Loan(
    val id: Long = 0L,
    val userId: Long,
    val loanProductId: Long,
    val collateralCryptoCurrencyId: Long,
    val loanCryptoCurrencyId: Long,
    val collateralWalletId: Long,
    val loanWalletId: Long,
    var status: LoanStatus,
    var collateralQuantity: Quantity,
    var loanQuantity: Quantity,
    val dailyInterests: List<DailyInterest>,
    val liquidation: Liquidation? = null,
    val marginCalls: List<MarginCall>,
    val interestPayment: List<InterestPayment>,
    val principalPayment: PrincipalPayment? = null,
    val activityHistories: List<LoanActivityHistory>,
    val histories: List<LoanHistory>,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime
) {
}