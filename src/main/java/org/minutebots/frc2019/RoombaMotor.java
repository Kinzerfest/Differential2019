package org.minutebots.frc2019;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.SpeedController;

public class RoombaMotor implements SpeedController {
    private static NetworkTableInstance ntInstance = NetworkTableInstance.create();
    static{
        ntInstance.startClient("frcvision.local");
    }

    private static NetworkTable table = ntInstance.getTable("Roomba");

    private String name;

    private boolean inverted = false;

    public RoombaMotor(String name){
        this.name = name;
    }

    @Override
    public void set(double speed) {
        table.getEntry(name).setDouble(inverted ? -speed : speed);
        System.out.println("Setting motor " + name + " " + get());
    }

    @Override
    public double get() {
        return table.getEntry(name).getDouble(0);
    }

    @Override
    public void setInverted(boolean isInverted) {
        inverted = isInverted;
    }

    @Override
    public boolean getInverted() {
        return inverted;
    }

    @Override
    public void disable() {
        set(0);
    }

    @Override
    public void stopMotor() {
        set(0);
    }

    @Override
    public void pidWrite(double output) {
        set(output);
    }
}
