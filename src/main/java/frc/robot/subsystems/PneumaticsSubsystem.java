// THIS IS NOT A PART OF IC-19
// I JUST FELT LIKE ADDING THIS BECAUSE I DIDN'T WANT TO MAKE A NEW PROGRAM FOR TESTING PNEUMATICS

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class PneumaticsSubsystem extends SubsystemBase {
    
    private final DoubleSolenoid solenoidTEST = new DoubleSolenoid(2, PneumaticsModuleType.CTREPCM, 0, 1); 

    public PneumaticsSubsystem () {}

    public void pneumaticsTEST (boolean toggle) {
        if (toggle) {
            solenoidTEST.toggle();
        } else {
            solenoidTEST.set(DoubleSolenoid.Value.kOff);
        }
    }

    public void extend () {
        solenoidTEST.set(DoubleSolenoid.Value.kForward);
        solenoidTEST.set(DoubleSolenoid.Value.kReverse);
    }
}
