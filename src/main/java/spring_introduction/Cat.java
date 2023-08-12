package spring_introduction;

/**
 * @author Sorokin Aleksei on 18.12.2022
 **/
public class Cat implements Pet {
    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }
}
