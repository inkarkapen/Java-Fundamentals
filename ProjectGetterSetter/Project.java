class Project{
   private String name;
   private String desc;
   private double cost;
   public Project(){}
   public Project(String name){
      this.name = name;
   }
   public Project(String name, String desc){
      this.name = name;
      this.desc = desc;
   }
   public Project(String name, String desc, double cost){
      this.name = name;
      this.desc = desc;
      this.cost = cost;
   }
   public String elevatorPitch(){
      return this.name + "(" + this.cost + "): " + this.desc;
   }
   public String getName(){
      return this.name;
   }
   public String getDesc(){
      return this.desc;
   }
   public double getCost(){
      return this.cost;
   }
   public void setName(String name){
      this.name = name;
   }
   public void getDesc(String desc){
      this.desc = desc;
   }
   public void getCost(double cost){
      this.cost = cost;
   }
}