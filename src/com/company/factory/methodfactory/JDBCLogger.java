package com.company.factory.methodfactory;

public class JDBCLogger implements Logger{
    @Override
    public void writeLog() {
        System.out.println("记录JDBC日志");
    }
}
