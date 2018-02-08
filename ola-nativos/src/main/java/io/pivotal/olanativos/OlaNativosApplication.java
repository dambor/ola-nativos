package io.pivotal.olanativos;

import oracle.jrockit.jfr.StringConstantPool;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class OlaNativosApplication {

	public static void main(String[] args) {
		SpringApplication.run(OlaNativosApplication.class, args);
	}
}

@RestController
class GreetingsRestController {

	@GetMapping("/hi")
	String hi() {
		return "Ola nativos na nuvem!";
	}

}
