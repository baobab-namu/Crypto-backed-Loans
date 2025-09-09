package playground.cryptobackedloans.app.client.domain.loan

enum class LoanStatus {
    ACTIVE,
    MARGIN_CALL,
    LIQUIDATION,
    REPAYMENT
}