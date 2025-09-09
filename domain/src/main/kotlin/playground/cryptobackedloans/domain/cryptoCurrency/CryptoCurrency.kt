package playground.cryptobackedloans.domain.cryptoCurrency

/**
 * 가상자산 (BTC, ETH..)
 */
class CryptoCurrency(
    val symbol: String,
    val precision: Int,
    val feePrecision: Int
) {
}