package playground.cryptobackedloans.app.client.domain.loan

enum class LiquidationType(
    val description: String
) {
    UNPAID_INTEREST("이자 미납"),
    UNPAID_PRINCIPAL("원금 미납"),
    EXCEEDING_LTV("LTV 청산 조건 발동")
}