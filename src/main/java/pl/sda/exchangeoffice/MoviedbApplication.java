package pl.sda.exchangeoffice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import pl.sda.exchangeoffice.config.NbpProperties;

@SpringBootApplication
@EnableConfigurationProperties(value = {NbpProperties.class})
public class MoviedbApplication {

    public static void main(String[] args) {
        SpringApplication.run(MoviedbApplication.class, args);
    }

}
