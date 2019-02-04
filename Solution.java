import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        // создай и заполни массив
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       int [] numb = new int[20];
       
       for(int i = 0; i < numb.length; i++){
          numb[i] = Integer.parseInt(reader.readLine()); 
       }
        return numb;
    }

    public static int max(int[] array) {
       
        // найди максимальное значение
        int numb = array[0];
      for(int i = 0; i < array.length; i++){
        if (numb < array[i]){
           numb = array[i];
        }
      } 
        return numb;
    }
