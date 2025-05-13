/*
Autor: Alwaro Pedro
Atividade: 02
Kata: Quadrants
Data: 06/05/2025
*/


public class Kata {
  
  public static int quadrant(int x, int y) {
    
    if(x > 0 && y > 0)
      return 1;
    else if(x < 0 && y > 0)
      return 2;
    else if(x < 0 && y < 0)
      return 3;
    else if(x > 0 && y < 0)
      return 4;
    
    
    return 0;
  }
}
