package nopops

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
class NoFreezepopApplication {

    static void main(String[] args) {
        SpringApplication.run NoFreezepopApplication.class, args
    }

}
