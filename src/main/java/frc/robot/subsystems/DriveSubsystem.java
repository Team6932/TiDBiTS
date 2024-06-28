package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveSubsystem extends SubsystemBase {
    
    private final Spark leftDrive = new Spark(Constants.leftDriveID);
    private final Spark rightDrive = new Spark(Constants.rightDriveID);

    private final DifferentialDrive driveSystem = new DifferentialDrive(leftDrive, rightDrive);

    public DriveSubsystem () {
        rightDrive.setInverted(true);
    }

    public void drive (double drivePower, double turnPower) {
        driveSystem.arcadeDrive(drivePower, turnPower);
    }

}
