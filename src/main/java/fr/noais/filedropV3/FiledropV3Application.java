package fr.noais.filedropV3;

import fr.noais.filedropV3.configuration.configurationProperties.FiledropConfigurationProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(FiledropConfigurationProperties.class)
public class FiledropV3Application {
	public static void main(String[] args) {
		SpringApplication.run(FiledropV3Application.class, args);
	}
}
