package br.com.jospin.services.corporate.backoffice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(
		scanBasePackages = {"br.com.jospin.services.library", "br.com.jospin.services.corporate.backoffice"},
		exclude = {DataSourceAutoConfiguration.class}
)
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
