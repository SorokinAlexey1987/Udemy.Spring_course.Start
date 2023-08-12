package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Sorokin Aleksei on 18.12.2022
 **/
public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext ("applicationContext.xml");

        Pet pet = context.getBean("myPet", Pet.class);
        pet.say();

        context.close();
    }
}
