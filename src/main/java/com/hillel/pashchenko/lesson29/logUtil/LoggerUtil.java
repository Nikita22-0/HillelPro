package com.hillel.pashchenko.lesson29.logUtil;

import java.io.IOException;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LoggerUtil {

    public static <T> Logger getLogger(Class<T> tClass) {
        try {
            LogManager.getLogManager().readConfiguration(
                    tClass.getResourceAsStream("/log4j.properties"));
            return Logger.getLogger(tClass.getName());
        } catch (IOException e) {
            System.err.println("Could not setup logger configuration: " + e);
        }
        return null;
    }
}
