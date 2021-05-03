/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David Ruhlman
 */
public class Calculations {
    
    private String XPType;
    private double ItemXP;
    private double ItemXPBonus;

    public Calculations(String XPType, double ItemXP, double ItemXPBonus) {
        this.XPType = XPType;
        this.ItemXP = ItemXP;
        this.ItemXPBonus = ItemXPBonus;
    }
    
    public Calculations(Calculations Blocksleft){
        this.XPType = Blocksleft.getXPType();
        this.ItemXP = Blocksleft.getItemXP();
        this.ItemXPBonus = Blocksleft.getItemXPBonus();
    }

    public String getXPType() {
        return XPType;
    }

    public void setXPType(String XPType) {
        this.XPType = XPType;
    }

    public double getItemXP() {
        return ItemXP;
    }

    public void setItemXP(double ItemXP) {
        this.ItemXP = ItemXP;
    }

    public double getItemXPBonus() {
        return ItemXPBonus;
    }

    public void setItemXPBonus(double ItemXPBonus) {
        this.ItemXPBonus = ItemXPBonus;
    }
    
    
    
    public double getBlocksleft(){
    //Only filtering out Foraging because it is the only skill not updated to level 60
        String Foraging = "Foraging";
    // An if statement to filter out Foraging from the other skills that hit level 60. Compare it to the class the user made.
    if(this.XPType.equals(Foraging)){
        
        double blocksneeded = (1 + (55172245 / (this.ItemXP +(this.ItemXP * this.ItemXPBonus))));
        return blocksneeded;
    }else{
        double blocksneeded = (1 + (111672425 / (this.ItemXP +(this.ItemXP * this.ItemXPBonus))));
        return blocksneeded;
    }  
    }
   
}


