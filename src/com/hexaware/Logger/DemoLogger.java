package com.hexaware.Logger;

import java.util.logging.Level;
import java.util.logging.Logger;

public class DemoLogger {
    public final static Logger LOGGER=Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public void makeSomeLog()
    {
        // add some code of your choice here
        // Moving to the logging part now
        LOGGER.log(Level.INFO, "My first Log Message");

        // A log of INFO level with the message "My First Log Message"
    }
}
