package app

import org.springframework.boot.*
import org.springframework.boot.autoconfigure.*
import org.springframework.stereotype.*

@EnableAutoConfiguration
class Application {
	static void main(final String... args) {
		SpringApplication.run(Application, args)
	}
}
