package spring_introduction;

/**
 * @author Sorokin Aleksei on 16.12.2022
 **/
public class Dog implements Pet {
    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }
}

