import java.util.*;
public class example{
   public static void main(String[] args){
//      //matrix rotation
//      int n[][] = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
//      System.out.print(Arrays.deepToString(rotateMatrix(n, 5)));


//      //matrix zero values     
//      int matrix[][] = {{1,0,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
//      System.out.print(Arrays.deepToString(nullifyMatrix(matrix)));
        LinkedList list = new LinkedList();
        list.add(new Node(10));
        list.add(new Node(12));
        list.add(new Node(11));
        list.add(new Node(11));
        list.add(new Node(12));
        list.add(new Node(11));
        list.add(new Node(10));
        //list.listToString();
        //list.removeDupl();
        //System.out.println(list.length);
        HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        Node node = list.head;
        map.put(node.value, new Boolean(true));
        while(node.next != null){
           if(map.containsKey(node.next.value)){
              if( map.get(node.next.value) == true ){
                 node.next = node.next.next;
              }
           }
           else{
              map.put(node.next.value, new Boolean(true));
              node = node.next;
           }
           
        }
        list.listToString();
  
   }
   
   
//    //ROTATEMATRIX
//    //matrix rotation by 90 degrees.
//    public static int[][] rotateMatrix(int[][] matrix, int n){
//       for(int i = 0; i < n/2; i++){
//          int last = n - i - 1;
//          for(int j = i; j < last; j++){
//             int offset = j - i;
//             
//             // save left-top corner value
//             int temp = matrix[i][j];
//             // left-bottom to left-top
//             matrix[i][j] = matrix[last - offset][i];
//             // bottom-right to bottom-left
//             matrix[last - offset][i] = matrix[last][last - offset];
//             //top-right to bottom-right
//             matrix[last][last - offset] = matrix[j][last];
//             //top-left to top-right
//             matrix[j][last] = temp;
//          }
//       }
//       return matrix;
//    }



//  //ZEROMATRIX
//  //if matrix has 0 value, set the whole row and column to zero
//    public static int[][] nullifyMatrix(int[][] matrix){
//       boolean firstRow = false;
//       boolean firstColumn = false;
//       for(int i = 0; i < matrix[0].length; i++){
//          if(matrix[0][i] == 0){
//             firstRow = true;
//          }
//       }
//       for(int i = 0; i < matrix.length; i++){
//          if(matrix[i][0] == 0){
//             firstColumn = true;
//          }
//       }
//       for(int i = 1; i < matrix.length; i++){
//          for(int j = 1; j < matrix[0].length; j++){
//             if(matrix[i][j] == 0){
//                matrix[i][0] = 0;
//                matrix[0][j] = 0;
//             }
//          }
//       }
//       for(int i = 1; i < matrix[0].length; i++){
//          if(matrix[0][i] == 0){
//             nullifyColumn(i, matrix);
//          }
//       }
//       for(int i = 1; i < matrix.length; i++){
//          if(matrix[i][0] == 0){
//             nullifyRow(i, matrix);
//          }
//       }
//       if(firstRow) nullifyRow(0, matrix);
//       if(firstColumn) nullifyColumn(0, matrix);
//       return matrix;
//    }
//    public static void nullifyRow(int row, int[][] matrix){
//       for(int i = 0; i < matrix[0].length; i++){
//          matrix[row][i] = 0;
//       }
//    }
//    public static void nullifyColumn(int column, int[][] matrix){
//       for(int i = 0; i < matrix.length; i++){
//          matrix[i][column] = 0;
//       }
//    }

   public static LinkedList removeDuplicates(){
      LinkedList list = new LinkedList();
      return list;
   }
}