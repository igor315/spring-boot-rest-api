package br.com.springboot.curso_jdev_treinamentos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 *
 * Spring Boot application starter class
 */
/**
 * @author Area de estudo
 *
 */

@EntityScan(basePackages = "br.com.springboot.curso_jdev_treinamento.model")
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
