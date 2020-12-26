package com.company.command;

class RemoteControl {
    Command command;

    public RemoteControl() {

    }

    void setCommand(Command command){
        this.command = command;
    }
    void pressButton(){
        command.execute();
    }
}
