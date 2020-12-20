package entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Parrot {
    @Autowired
    private String name ="Parrot";

    @Bean
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public Object weNeedMoreParrots() {
        return new Parrot();
    }


}
