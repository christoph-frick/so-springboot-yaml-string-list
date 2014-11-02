package app

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.*
import org.springframework.boot.autoconfigure.*
import org.springframework.context.annotation.ComponentScan
import org.springframework.stereotype.*

@EnableAutoConfiguration
@ComponentScan
class Application {
	static void main(final String... args) {
		def ctx = SpringApplication.run(Application, args)
        println ctx.getBean(Config).filenames
	}
}
