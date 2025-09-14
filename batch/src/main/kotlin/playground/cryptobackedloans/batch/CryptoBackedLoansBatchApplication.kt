package playground.cryptobackedloans.batch

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@EnableScheduling
@SpringBootApplication
class CryptoBackedLoansBatchApplication

fun main(args: Array<String>) {
    runApplication<CryptoBackedLoansBatchApplication>(*args)
}
