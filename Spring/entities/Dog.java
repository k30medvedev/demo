package entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Dog {

    private String name;

    @Bean
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
