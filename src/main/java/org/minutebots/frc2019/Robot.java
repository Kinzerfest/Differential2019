package org.minutebots.frc2019;


import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class Robot extends TimedRobot {
  /**
   * This function is run when the robot is first started up and should be used
   * for any initialization code.
   */

  private Joystick joystick = new Joystick(0);
  private RoombaMotor left = new RoombaMotor("leftMotor");
  private RoombaMotor right = new RoombaMotor("rightMotor");
  private DifferentialDrive driveTrain;

  @Override
  public void robotInit() {
    right.setInverted(true);
    driveTrain = new DifferentialDrive(left, right);
  }

  @Override
  public void teleopInit() {
  }

  @Override
  public void teleopPeriodic() {
    driveTrain.curvatureDrive(-joystick.getY(), joystick.getX(), joystick.getTrigger());
  }

  @Override
  public void testInit() {
  }

  @Override
  public void testPeriodic() {
  }

}
