import java.lang.Math;
class Bank{
   private String accountNum;
   private double checking;
   private double saving;
   static int accounts;
   static int totalMoney;
   public Bank(){
      this.accountNum = accountNum();
      accounts ++;
      
   }
   private String accountNum(){
      String number = "";
      number += (int)(Math.random() * 1000000 + Math.random() * 1000000);
      return number;
   }
   public double checking(){
      return this.checking;
   }
   public double saving(){
      return this.saving;
   }
   public void depositChecking(int amount){
      this.checking += amount;
      totalMoney += amount;
   }
   public void depositSaving(int amount){
      this.saving += amount;
      totalMoney += amount;
   }
   public String withdrawChecking(int amount){
      if((this.checking - amount) < 0){
         return "Not enough funds";
      }
      this.checking -= amount;
      totalMoney -= amount;
      return "Success";
   }
   public String withdrawSaving(int amount){
      if((this.saving - amount) < 0){
         return "Not enough funds";
      }
      this.saving -= amount;
      totalMoney -= amount;
      return "Success";
   }
   public double totalAccountMoney(){
      return this.checking + this.saving;
   }
}