class BasicJava{
   public void printAll(){
      for(int i = 1; i < 256; i++){
         System.out.println(i);
      }
   }
   public void printOdd(){
      for(int i = 1; i < 256; i++){
         if(!(i % 2 == 0)){
            System.out.println(i);
         }
      }
   }
   public void printSum(){
      int sum = 0;
      for(int i = 1; i < 256; i++){
         sum += i;
         System.out.println("Number is "+i+". Sum is "+sum);
      }
   }
   public void printArray(int[] arr){
      for(int i: arr){
         System.out.println(i);
      }
   }
   public void findMax(int[] arr){
      int max = arr[0];
      for(int i: arr){
         if(max < i){
            max = i;
         }
      }
      System.out.print(max);
   }
   public void findAvarage(int[] arr){
      int sum = 0;
      for(int i: arr){
         sum += i;
      }
      System.out.print(sum/arr.length);
   }
   public int[] oddArray(){
      int[] arr = new int[128];
      int idx = 0;
      for(int i=1; i < 256; i++){
         if(!(i % 2 == 0)){
            arr[idx] = i;
            idx++;
         };
      }
      return arr;
   }
   public int graterY(int[] arr, int y){
      int count = 0;
      for(int i: arr){
         if(i > y){
            count++;
         }
      }
      return count;
   }
   public int[] squareValues(int[] arr){
      for(int i = 0; i < arr.length; i++){
         arr[i] *= arr[i];
      }
      return arr;
   }
   public int[] noNegative(int[] arr){
      for(int i = 0; i < arr.length; i++){
         if(arr[i] < 0){
            arr[i] = 0;
         }
      }
      return arr;
   }
   public int[] minMaxAve(int[] arr){
      int[] minMaxAve = new int[3];
      for(int i: arr){
         if(i < minMaxAve[0]){
            minMaxAve[0] = i;
         }
         if(i > minMaxAve[1]){
            minMaxAve[1] = i;
         }
         minMaxAve[2] += i;
      }
      minMaxAve[2] /= 3;
      return minMaxAve;
   }
   public int[] shift(int[] arr){
      for(int i = 0; i < arr.length-1; i++){
         arr[i] = arr[i+1];
      }
      arr[arr.length-1] = 0;
      return arr;
   }
}