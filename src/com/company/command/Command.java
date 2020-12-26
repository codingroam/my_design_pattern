package com.company.command;

public interface Command {
    void execute();
    //可根据业务需求加入undo方法,用于撤销命令
//    void undo();
}
