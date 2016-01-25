package app

import org.springframework.boot.*
import org.springframework.boot.autoconfigure.*

@SpringBootApplication
class Application {
	static void main(final String... args) {
		def ctx = SpringApplication.run(Application, args)
	        assert ctx.getBean(Config).filenames == ["test1", "test2"]
	}
}
