class Human{
   int strength;
   int stealth;
   int intelligence;
   int health;
   public Human(){
      this.strength = 3;
      this.stealth = 3;
      this.intelligence = 3;
      this.health = 100;
   }
   public void attack(Human human){
      human.health -= this.strength;
   }
   public void heal(Human human){
      human.health += this.intelligence;
   } 
   public void fireball(Human human){
      human.health -= this.intelligence;
   }
   public void steal(Human human){
      human.health -= this.stealth;
      this.stealth += this.stealth;
   }
   public void runAway(Human human){
      this.health -= 10;
   }
}