/*
Autor: Alwaro Pedro
Atividade: 03
Kata: Vowel Count
Data: 08/05/2025
*/
public class Vowels {

  public static int getCount(String str) {
    int count = 0;
    
    for (int i = 0; i < str.length(); i++) {
      char letter = str.charAt(i);
      if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
        count++;
      }
    }

    return count;
  }

}
