/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
        
import java.awt.Graphics2D;
import robocode.AdvancedRobot;
import robocode.Robot;
import robocode.Droid;
import robocode.Rules;
import robocode.ScannedRobotEvent;
import robocode.TeamRobot;

/**
 *
 * @author usuario
 */
public class MyRobot1 extends AdvancedRobot {

    @Override

    public void run() {

        setAdjustGunForRobotTurn(true);
        setAdjustRadarForGunTurn(true);

        while (true) {
            setAhead(getBattleFieldWidth() * 0.3);
            setTurnLeft(90);
            setTurnRadarRight(90);
            execute();
            
            System.out.println(getHeading()); //mirar en terminal de batalla
            SystemDebbuggin()

        }
    }
    
    public void onPaint(Graphics2D g){
        g.drawLine(0,0,(int)this.getX(),(int)this.getY());
    }

}
