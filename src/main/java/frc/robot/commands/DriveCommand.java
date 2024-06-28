package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.DriveSubsystem;

public class DriveCommand extends Command {
    
    private final DriveSubsystem driveSubsystem;
    private DoubleSupplier drivePower, turnPower;

    public DriveCommand (DriveSubsystem driveSubsystem, DoubleSupplier drivePower, DoubleSupplier turnPower) {
        this.driveSubsystem = driveSubsystem;
        this.drivePower = drivePower;
        this.turnPower = turnPower;
        addRequirements(driveSubsystem);
    }

    @Override
    public void initialize () {}

    @Override
    public void execute () {
        driveSubsystem.drive(drivePower.getAsDouble(), turnPower.getAsDouble());
    }

    @Override
    public void end (boolean interrupted) {
        driveSubsystem.drive(0, 0);
    }

    @Override
    public boolean isFinished () {
        return false;
    }
}
