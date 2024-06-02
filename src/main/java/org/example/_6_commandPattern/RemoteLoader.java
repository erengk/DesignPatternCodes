package org.example._6_commandPattern;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        CeilingFan livingRoomCeilingFan = new CeilingFan("Living Room");
        TV livingRoomTV = new TV("Living Room");

        CeilingFanHighCommand livingRoomCeilingFanHigh = new CeilingFanHighCommand(livingRoomCeilingFan);
        CeilingFanOffCommand livingRoomCeilingFanOff = new CeilingFanOffCommand(livingRoomCeilingFan);
        TVOnCommand livingRoomTVOn = new TVOnCommand(livingRoomTV);
        TVOffCommand livingRoomTVOff = new TVOffCommand(livingRoomTV);

        remoteControl.setCommand(0, livingRoomCeilingFanHigh, livingRoomCeilingFanOff);
        remoteControl.setCommand(1, livingRoomTVOn, livingRoomTVOff);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println("Undo last command:");
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        System.out.println("Undo last command:");
        remoteControl.undoButtonWasPushed();
    }
}

