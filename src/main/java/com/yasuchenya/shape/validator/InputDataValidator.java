package com.yasuchenya.shape.validator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class InputDataValidator {
    static Logger logger = LogManager.getLogger();
    private final static String OVAL_DECLARATION = "(\\(\\d*\\,\\d*\\)){3}";

    public static boolean isDataValid(String sourceString){
        boolean result = sourceString.matches(OVAL_DECLARATION);
        logger.info("Result of data validation is " + result);
        return result;
    }
}
