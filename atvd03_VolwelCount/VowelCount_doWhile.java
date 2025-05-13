/*
Autor: Alwaro Pedro
Atividade: 03
Kata: Vowel Count
Data: 08/05/2025
*/


public class Vowels {

  public static int getCount(String str) {
    int count = 0;
    int i = 0;

    if (str.length() == 0) return 0; // evita erro se string for vazia

    do {
      char letter = str.charAt(i);
      
      if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
        count++;
      }
      i++;
    } while (i < str.length());

    return count;
  }

}
