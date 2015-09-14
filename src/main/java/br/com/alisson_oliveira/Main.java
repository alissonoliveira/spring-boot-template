package br.com.alisson_oliveira;

import br.com.alisson_oliveira.domain.ExampleEntity;
import br.com.alisson_oliveira.services.ExampleService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);
        ExampleEntity entity1 = new ExampleEntity();
        entity1.setName("Entity1");
        ExampleEntity entity2 = new ExampleEntity();
        entity2.setName("Entity2");
        ExampleEntity entity3 = new ExampleEntity();
        entity3.setName("Entity3");
        ExampleService service = context.getBean(ExampleService.class);
        service.save(entity1);
        service.save(entity2);
        service.save(entity3);
    }
}
