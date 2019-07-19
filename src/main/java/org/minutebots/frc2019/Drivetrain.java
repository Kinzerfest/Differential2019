package org.minutebots.frc2019;

import com.team254.lib.physics.DifferentialDrive;
import org.ghrobotics.lib.localization.Localization;
import org.ghrobotics.lib.mathematics.twodim.control.TrajectoryTracker;
import org.ghrobotics.lib.mathematics.twodim.control.TrajectoryTrackerOutput;
import org.ghrobotics.lib.mathematics.twodim.geometry.Pose2d;
import org.ghrobotics.lib.mathematics.units.Length;
import org.ghrobotics.lib.motors.FalconMotor;
import org.ghrobotics.lib.subsystems.drive.TankDriveSubsystem;
import org.ghrobotics.lib.subsystems.drive.TrajectoryTrackerDriveBase;
import org.jetbrains.annotations.NotNull;

public class Drivetrain implements TrajectoryTrackerDriveBase {

    @NotNull
    @Override
    public FalconMotor<Length> getLeftMotor() {
        return null;
    }

    @NotNull
    @Override
    public FalconMotor<Length> getRightMotor() {
        return null;
    }

    @NotNull
    @Override
    public Pose2d getRobotPosition() {
        return null;
    }

    @NotNull
    @Override
    public TrajectoryTracker getTrajectoryTracker() {
        return null;
    }

    @Override
    public void setOutput(@NotNull TrajectoryTrackerOutput trajectoryTrackerOutput) {

    }

    @Override
    public void zeroOutputs() {

    }
}
