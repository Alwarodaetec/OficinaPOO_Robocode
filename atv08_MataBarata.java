package matabarata;
import robocode.*;

public class Matabarata extends Robot {
    public void run() {
        // Gira o radar o tempo todo
        while(true) {
            turnGunRight(10);  // varre lentamente com o radar
        }
    }

    public void onScannedRobot(ScannedRobotEvent event) {
        // Atira com potência dependendo da distância
        double distance = event.getDistance();
        double firePower;
		 stop();
        // Define potência do tiro conforme distância
        if (distance < 100) {
            firePower = 3;
        } else if (distance < 300) {
            firePower = 2;
        } else {
            firePower = 1;
        }

        // Vira o canhão para o inimigo (ajuste fino)
                fire(firePower);
		turnGunRight(event.getBearing());
        	fire(firePower);

    }
}