import java.util.*;
class PuzzleJava{
   public static void main(String[] args){
      int[] arr = {3,5,1,2,7,9,8,13,25,32};
      //System.out.print(printAll(arr, 10));
      //String[] arr2 = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
      //System.out.print(printNames(arr2, 5));
      //System.out.print(Arrays.toString(randomNums(55, 100)));
      System.out.print(randomWords());
   }
   public static ArrayList<Integer> printAll(int[] arr, int y){
      ArrayList<Integer> output = new ArrayList<Integer>();
      for(int i: arr){
         System.out.print(i);
         if(i < y){
            output.add(i);
         }
      }
      return output;
   }
   public static ArrayList<String> printNames(String[] arr, int y){
      ArrayList<String> arrNames = new ArrayList<String>();
      for(String name: arr){
         if(name.length() > y){
            arrNames.add(name);
         }
         System.out.println(name);
      }
      return arrNames;
   }
   public static int[] randomNums(int min, int max){
      int[] arr = new int[10];
      Random rand = new Random();
      for(int i = 0; i < 10; i++){
         arr[i] = rand.nextInt(max - min) + min;
      }
      Arrays.sort(arr);
      return arr;
   }
   public static String randomWords(){
      String word = "";
      int random;
      for(int i = 0; i < 5; i++){
         random = (int)(Math.random()*26+97);
         word += (char)random;
      }
      return word;
   }
}