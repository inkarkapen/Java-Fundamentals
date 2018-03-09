class LinkedList{
   Node head;
   Node current;
   Node previous;
   public LinkedList(){
   }
   public void add(Object obj){
      Node node = new Node(obj);
      if(this.current != null){
         current.setNext(node);
         this.previous = this.current;
         this.current = node;
      }
      else if(this.head != null){
         this.head.setNext(node);
         this.previous = this.head;
         this.current = node;
      }
      else{
         this.head = node;
      }
   }
   public void setHead(Object head){
      Node node = new Node(head);
      this.head = node;
   }
   public void remove(){
      this.previous.setNext(null);
      this.current = this.previous;
   }
   public void tostring(){
      System.out.println(this.head.value);
      Node node = this.head;
      while(node.hasNext()){
      node = node.getNext();
         System.out.println(node.value);
      }
   }
}