package MüllerBen;
import robocode.*;

public class RollendesRadisli extends JuniorRobot
{

	public void run() {
		
		setColors(black, blue, black, yellow, blue);

		
		while(true) {
		
			ahead(500);
			turnLeft(75);
			turnGunLeft(360);
		}
	}


	public void onScannedRobot() {
	}	
	public void smartFire() {

	if(scannedEnergy > 41){
			fire(1);
			turnRight(200);
			ahead(500);
			} else if(scannedDistance >= 200){
				fire(1);
			} else { ahead(scannedDistance + 10);
			bearGunTo(scannedBearing);
			fire();
			fire(3);
			fire();
			turnRight(scannedBearing);
			bearGunTo(scannedBearing);
			ahead(scannedDistance + 10);
			fire(3);
			fire(2);
		    }
	
		
	}


	public void hitByEnemy() {
		
		ahead(288);	
		turnRight(15);	

}
	

		public void onHitWall() {
		
		turnLeft(168);
		ahead(20);
	

}	
}
