package com.company.factory.methodfactory;

public class Test {


    public static void main(String[] args) {
        Logger logger = new FileLoggerFactory().createLogger();
        logger.writeLog();
    }
}
