class Mammal{
   int energyLevel;
   public Mammal(){
      this.energyLevel = 100;
   }
   public Mammal(int energy){
      this.energyLevel = energy;
   }
   public int displayEnergy(){
      return this.energyLevel;
   }
}