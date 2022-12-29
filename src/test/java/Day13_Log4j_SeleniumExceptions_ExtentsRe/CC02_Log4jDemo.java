package Day13_Log4j_SeleniumExceptions_ExtentsRe;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class CC02_Log4jDemo {
    public static void main(String[] args) {
        PropertyConfigurator.configure("log4j.properties");

        Logger logger= LogManager.getLogger(C01_Log4jDemo.class.getName());

        logger.trace("Trace");
        logger.debug("Debug");
        logger.info("Info");
        logger.warn("Warn");
        logger.error("Error");
        logger.fatal("Fatal");

    }
}
