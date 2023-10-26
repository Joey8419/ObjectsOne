package object1;

import java.util.logging.Logger;

public class Main {

    public static void main(String... args) {
        Persons person1 = new Persons("Joey", 25, 152.4 );
        Logger logger=Logger.getLogger(Main.class.getName());
        logger.info("This is a module-using Hello World!");
        logger.info(String.valueOf(person1.getHeight()));
    }
}

//Define class
