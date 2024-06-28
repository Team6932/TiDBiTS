package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.commands.DriveCommand;
import frc.robot.subsystems.DriveSubsystem;

public class RobotContainer {

  private final DriveSubsystem driveSubsystem = new DriveSubsystem();

  // logitech attack 3
  private final Joystick controller = new Joystick (0);

  public RobotContainer() {

    configureBindings();

    driveSubsystem.setDefaultCommand(new DriveCommand(driveSubsystem, 
      () -> -controller.getY(), () -> -controller.getX()));
  }

  private void configureBindings() {}

  public Command getAutonomousCommand() {
    return null;
  }
}
