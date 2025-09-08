package playground.cryptobackedloans.domain.loan

enum class LoanStatus {
    ACTIVE,
    MARGIN_CALL,
    LIQUIDATION,
    REPAYMENT
}