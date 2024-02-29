package object1;

import java.util.logging.Logger;

public class Main
{

    public static void main(String... args)

    {
        Logger logger=Logger.getLogger(Main.class.getName());

    logger.info("This is a module-using Hello World!");

    Person ahmed = new Person ("Ahmed", 8, 5);
       // System.out.println(ahmed.getHeight());
    }






}

