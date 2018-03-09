class Dragon extends Mammal{
   public Dragon(){
      super(300);
   }
   public void fly(){
      this.energyLevel -= 25;
   } 
   public void eatHumans(){
      this.energyLevel += 50;
   } 
   public void attackTown(){
      this.energyLevel += 100;
   }

}