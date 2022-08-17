package com.company.factory.methodfactory;

public class JDBCLoggerFactory implements LoggerFactory{
    @Override
    public Logger createLogger() {
        return new JDBCLogger();
    }
}
