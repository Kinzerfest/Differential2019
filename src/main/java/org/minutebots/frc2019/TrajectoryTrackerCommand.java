package org.minutebots.frc2019;
/*
import com.ctre.phoenix.Logger;
import edu.wpi.first.wpilibj.Notifier;
import edu.wpi.first.wpilibj.experimental.command.SendableCommandBase;
import org.ghrobotics.lib.debug.LiveDashboard;
import org.ghrobotics.lib.mathematics.twodim.control.TrajectoryTracker;
import org.ghrobotics.lib.mathematics.twodim.control.TrajectoryTrackerOutput;
import org.ghrobotics.lib.mathematics.twodim.geometry.Pose2dWithCurvature;
import org.ghrobotics.lib.mathematics.twodim.trajectory.types.TimedTrajectory;
import org.ghrobotics.lib.mathematics.units.Length;
import org.ghrobotics.lib.mathematics.units.TimeUnitsKt;

import java.util.function.Supplier;

public class TrajectoryTrackerCommand extends SendableCommandBase {
    private TrajectoryTracker trajectoryTracker;
    private Supplier<TimedTrajectory<Pose2dWithCurvature>> trajectorySource;
    private DriveTrain driveBase;
    private boolean reset;
    private TrajectoryTrackerOutput output;
    Length mDesiredLeft;
    Length mDesiredRight;
    double mCurrentLeft;
    double mCurrentRight;

    Notifier mUpdateNotifier;

    public TrajectoryTrackerCommand(DriveTrain driveBase, Supplier<TimedTrajectory<Pose2dWithCurvature>> trajectorySource) {
        this(driveBase, trajectorySource, false);
    }

    public TrajectoryTrackerCommand(DriveTrain driveBase, Supplier<TimedTrajectory<Pose2dWithCurvature>> trajectorySource, boolean reset) {
        this(driveBase, Robot.drivetrain.getTrajectoryTracker(), trajectorySource, reset);
    }

    public TrajectoryTrackerCommand(DriveTrain driveBase, TrajectoryTracker trajectoryTracker, Supplier<TimedTrajectory<Pose2dWithCurvature>> trajectorySource, boolean reset) {
        addRequirements(driveBase);
        this.driveBase = driveBase;
        this.trajectoryTracker = trajectoryTracker;
        this.trajectorySource = trajectorySource;
        this.reset = reset;
    }

    @Override
    public void initialize() {
        LiveDashboard.INSTANCE.setFollowingPath(false);


        trajectoryTracker.reset(this.trajectorySource.get());

        if (reset == true) {
            Robot.drivetrain.getLocalization().reset(trajectorySource.get().getFirstState().getState().getPose());
        }

        LiveDashboard.INSTANCE.setFollowingPath(true);

        mUpdateNotifier = new Notifier(() -> {
            output = trajectoryTracker.nextState(driveBase.getRobotPosition(), TimeUnitsKt.getSecond(Timer.getFPGATimestamp()));

            TrajectorySamplePoint<TimedEntry<Pose2dWithCurvature>> referencePoint = trajectoryTracker.getReferencePoint();
            if (referencePoint != null) {
                Pose2d referencePose = referencePoint.getState().getState().getPose();

                LiveDashboard.INSTANCE.setPathX(referencePose.getTranslation().getX().getFeet());
                LiveDashboard.INSTANCE.setPathY(referencePose.getTranslation().getY().getFeet());
                LiveDashboard.INSTANCE.setPathHeading(referencePose.getRotation().getRadian());

            }

            driveBase.setOutput(output);

        });
        mUpdateNotifier.startPeriodic(0.01);
    }

    @Override
    public void end(boolean interrupted) {
        mUpdateNotifier.stop();
        driveBase.stop();
        LiveDashboard.INSTANCE.setFollowingPath(false);
    }

    @Override
    public boolean isFinished() {
        return trajectoryTracker.isFinished();
    }

    public TimedTrajectory<Pose2dWithCurvature> getTrajectory() {
        return this.trajectorySource.get();
    }

}*/