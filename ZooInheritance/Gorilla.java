class Gorilla extends Mammal{
   public Gorilla(){
      super();
   }
   public void throwSomething(){
      this.energyLevel -= 5;
      System.out.println("Threw banana");
   }
   public void eatBanana(){
      System.out.println("Energy level before banana " + this.energyLevel);
      this.energyLevel += 10;
      System.out.println("Energy level after banana " + this.energyLevel);
   }
   public void climb(){
      System.out.println("Gorilla is climbing");
   }
}