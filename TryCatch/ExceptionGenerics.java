import java.util.ArrayList;
class ExceptionGenerics{
   public static void main (String[] args){
      ArrayList<Integer> myList = new ArrayList<Integer>();
      myList.add(13);
      myList.add("hello world");
      myList.add(48);
      myList.add("Goodbye World");
      System.out.println(myList);
      for(Object num: myList){
         try{
            Integer castedValue = (Integer) num;
         } catch(ClassCastException e){
            System.out.println(num+" not a number");
         }
         
      }
   }

}