package object1;

import java.util.logging.Logger;

public class Main {

    public static void main(String... args) {
        Logger logger = Logger.getLogger(Main.class.getName());
        logger.info("This is a module-using Hello World!");

       Person Person1 = new Person("sss", 2);
        System.out.println(Person1.height);

        Person person2 = new Person("ahmed", 5, 4);

        Car Cow = new Car("31", "1980", 4,4);
        System.out.println(Cow.getModel());

        Chair Chair2 = new Chair("WOOD", "red", 4);
        System.out.println(Chair2.getMaterial());

        Dog Pitbull = new Dog("pitbull", 5, "I don't know");
        System.out.println(Pitbull.getName());

    }


}