package com.company.factory.methodfactory;

public class FileLogger implements Logger{
    @Override
    public void writeLog() {
        System.out.println("记录文件日志");
    }
}
