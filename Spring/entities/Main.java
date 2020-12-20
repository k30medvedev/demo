package entities;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import javax.sound.midi.Soundbank;

@Component

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(Cat.class, Dog.class, Parrot.class);
        Cat cat = context.getBean(Cat.class);
        Dog dog = context.getBean(Dog.class);
        //Parrot parrot = context.getBean(Parrot.class);

        Parrot parrot2 = context.getBean(Parrot.class);

        System.out.println(cat.getName());
        System.out.println(dog.getName());

        System.out.println(cat.toString());
        //System.out.println(parrot.getName());

        System.out.println(parrot2.getName());
        System.out.println(parrot2.weNeedMoreParrots());


    }
}
