class Node{
   Object value;
   Node next;
   public Node(Object obj){
      this.value = obj;
   }
   public Node getNext(){
      if(hasNext()){
         return this.next;
      }
      else{
         return null;
      }
   }
   public void setNext(Node node){
      this.next = node;
   }
   public boolean hasNext(){
      if(this.next != null){
         return true;
      }
      else{
         return false;
      }
   }
}