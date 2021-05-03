
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David Ruhlman
 */
public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
          
    //Gather player info for calculations
    System.out.println("Enter Farming, Foraging or Mining. You can enter one and then another to test if one is more efficient. If no second skill enter any text.");
        String SkillType = sc.nextLine();
        String SkillType2 = sc.nextLine();
              
    System.out.println("Enter amount of xp from each block. You can enter one and then another to test if one is more efficient. If no second skill enter 0");
        String XpPerItem = sc.nextLine();
        double XPAmount = Double.parseDouble(XpPerItem);
        String XpPerItem2 = sc.nextLine();
        double XPAmount2 = Double.parseDouble(XpPerItem2);
        
        System.out.println("Enter the xp buffs you have. For example a pet, cookie or potion. Enter as a decimal. For example 20% = .2");
        System.out.println("You can enter one and then another to test if one is more efficient. I no bonus enter 0.");
        String XpBonus = sc.nextLine();
        double XPAmountBonus = Double.parseDouble(XpBonus);
        String XpBonus2 = sc.nextLine();
        double XPAmountBonus2 = Double.parseDouble(XpBonus2);
        
        
    //Made an object to allow for easier skill adding in the future and to allow for multiple skills being calculated in future revisions.
    Calculations USEROne = new Calculations(SkillType, XPAmount, XPAmountBonus);
    Calculations USERTwo = new Calculations(SkillType2, XPAmount2, XPAmountBonus2);
    
    //Geting the blocks needed to break to put in the time calculation methods. I could not add USEROne.getBlocksleft() into the method.
    double blocksneeded = USEROne.getBlocksleft();
    double blocksneeded2 = USERTwo.getBlocksleft();
    
    double fastesttime = BestTime(blocksneeded);
    double expectedtime = ReasonableTime(blocksneeded);
    double fastesttime2 = BestTime2(blocksneeded2);
    double expectedtime2 = ReasonableTime2(blocksneeded2);
    
    
    System.out.println("You need to break " + String.format("%.0f", USEROne.getBlocksleft()) + " for" + USEROne.getXPType() + ".");  
    System.out.println("This is the best possible time " + String.format("%.2f", fastesttime) + " hours");
    System.out.println("This is the expected amount of time " + String.format("%.2f", expectedtime) + " hours");
    System.out.println();
    System.out.println("You need to break " + String.format("%.0f", USERTwo.getBlocksleft()) + " for" + USERTwo.getXPType() + ".");  
    System.out.println("This is the best possible time " + String.format("%.2f", fastesttime2) + " hours");
    System.out.println("This is the expected amount of time " + String.format("%.2f", expectedtime2) + " hours");
        
  }
       //Since Minecrafts cap on blocks able to break per second is 20, I am going to use that number to give a most efficient number. Late Game Players
       public static double BestTime(double blocksneeded){
           
       double besttime = blocksneeded / 72000;
       
       return besttime;
       }
       
       //I am then going to make a reasonable time that most mid game player will be able to reach. Also more casual player.
       public static double ReasonableTime(double blocksneeded){
           
       double midtime = blocksneeded / 36000;
       
       return midtime;
       }
       
       public static double BestTime2(double blocksneeded2){
           
       double besttime = blocksneeded2 / 72000;
       
       return besttime;
       }
       
       //I am then going to make a reasonable time that most mid game player will be able to reach. Also more casual player.
       public static double ReasonableTime2(double blocksneeded2){
           
       double midtime = blocksneeded2 / 36000;
       
       return midtime;
       }
       
        
}