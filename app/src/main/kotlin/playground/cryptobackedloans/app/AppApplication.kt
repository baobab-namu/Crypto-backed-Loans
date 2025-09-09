package playground.cryptobackedloans.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import playground.cryptobackedloans.client.DummyAppApplication

@SpringBootApplication
class AppApplication

fun main(args: Array<String>) {
    runApplication<DummyAppApplication>(*args)
}
