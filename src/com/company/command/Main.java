package com.company.command;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(new LightOffCommand(light));
        remoteControl.pressButton();
    }
}
