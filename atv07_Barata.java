/*
Autor: Alwaro Pedro
Atividade: 07
Título: Robô Barata
Data: 22/05/2025
*/

package barata;
import robocode.*;
public class Barata extends Robot
{
    public void run() {
        // Começa andando reto (para frente)
        while(true){
			ahead(400);  
		}
    }

    public void onHitWall(HitWallEvent event) {
		setDebugProperty("Angulo da colisão", String.valueOf(event.getBearing()));
        while(true){
		turnLeft(1);
		ahead(800);
		}
	}
}
