package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.PneumaticsSubsystem;

public class PneumaticsCommand extends Command {
    
    private final PneumaticsSubsystem pneumaticsSubsystem;
    private Timer timer = new Timer();

    public PneumaticsCommand(PneumaticsSubsystem pneumaticsSubsystem) {
        this.pneumaticsSubsystem = pneumaticsSubsystem;
        addRequirements(pneumaticsSubsystem);
    }

    @Override
    public void initialize () {
        timer.reset();
        pneumaticsSubsystem.pneumaticsTEST(true);
    }

    @Override
    public void execute () {
        //pneumaticsSubsystem.extend();
    }

    @Override
    public void end (boolean interrupted) {
        pneumaticsSubsystem.pneumaticsTEST(false);
    }

    @Override
    public boolean isFinished () {
        /*if (timer.hasElapsed(0.3)) {
            return true;
        } else {
            return false; 
        }*/
        return true; 
    }
}
