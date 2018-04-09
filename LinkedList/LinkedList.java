class LinkedList{
   Node head;
   int length;
   Node last;
   public LinkedList(){
      this.head = null;
      this.last = null;
      length = 0;
   }
   void add(Node node){
      if(this.head == null){
         this.head = node;
      }
      else{
         this.last.next = node;
      }
      this.last = node;
      this.length++;
   }
   void listToString(){
      Node node = this.head;
      while(node != null){
         System.out.println(node.value);
         node = node.next;
      }
   }
   void removeDupl(){
      Node node = this.head;
      System.out.println("head is "+node.value);
      while(node != null && node.next != null){
         System.out.println("node is "+node.value+" next node is "+node.next.value);
         if(node.value == node.next.value){
            node.next = node.next.next;
         }
         node = node.next;
      }
   }
}