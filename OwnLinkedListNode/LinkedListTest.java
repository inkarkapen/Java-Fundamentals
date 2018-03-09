class LinkedListTest{
   public static void main (String[] args){
      LinkedList list = new LinkedList();
      list.setHead("head");
      list.add("node1");
      list.add("node2");
      list.remove();
      list.add("node2");
      list.add("node3");
      list.remove();
      list.add("node3");
      list.tostring();
   }
}