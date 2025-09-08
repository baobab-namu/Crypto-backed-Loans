package playground.cryptobackedloans.domain.loan

enum class LoanActivityHistoryType(
    val description: String
) {
    ACTIVE("대출 시작"),
    UNPAID_INTEREST("이자 미납"),
    UNPAID_PRINCIPAL("원금 미납"),
    EXCEEDING_LTV("LTV 청산 조건 발동"),
    INVOKED_MARGIN_CALL("마진콜 발생"),
    RELEASE_MARGIN_CALL("마진콜 해제"),
    LIQUIDATION("청산"),
    REPAYMENT("상환");
}