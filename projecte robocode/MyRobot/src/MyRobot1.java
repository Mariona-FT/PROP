/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import robocode.AdvancedRobot;
import robocode.Robot;
/**
 *
 * @author usuario
 */
public class MyRobot1 extends AdvancedRobot{
   @Override
   
    public void run() {
        
        setAdjustGunForRobotTurn(true);
        setAdjustRadarForGunTurn(true);
        
        while (true){
            setAhead(getBattleFieldWidth()*0.3);
            setTurnLeft(90);
            setTurnRadarRight(90);
            execute();
                 
        }
    }
    
}
