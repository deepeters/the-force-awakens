package ke.springboot.graphql.theforceapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication (scanBasePackages = "spring.boot.graphql.rest.wrapper")
public class TheForceApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TheForceApiApplication.class, args);
	}

}
