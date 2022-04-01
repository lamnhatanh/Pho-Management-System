/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pho;

/**
 *
 * @author anh
 */
public class Menu {
    public double smallSpecial;
    public double smallSteak;
    public double smallBrisket;
    public double smallSandF;
    public double smallSTT;
    public double smallMeatball;
    
    public double largeSpecial;
    public double largeSteak;
    public double largeBrisket;
    public double largeSandF;
    public double largeSTT;
    public double largeMeatball;
    
    public double Smoothies;
    public double IC;
    public double HC;
    public double Soda;
    public double BW;
    public double OJ;
    public double Tea;
    
    public double getTotal(){
        double smallPho;
        double largePho;
        double drink;
        smallPho = smallSpecial + smallSteak + smallBrisket + smallSandF +
                smallSTT + smallMeatball;
        largePho = largeSpecial + largeSteak + largeBrisket + largeSandF +
                largeSTT + largeMeatball;
        drink = Smoothies + IC + HC + Soda + BW + OJ + Tea;
        double subTotal = smallPho + largePho + drink;
        return subTotal;
    }
    
    // Item Price
    public double smallSpecialp = 9.99;
    public double smallSteakp = 9.99;
    public double smallBrisketp = 9.99;
    public double smallSandFp = 9.99;
    public double smallSTTp = 9.99;
    public double smallMeatballp = 9.99;
    
    public double largeSpecialp = 10.99;
    public double largeSteakp = 10.99;
    public double largeBrisketp = 10.99;
    public double largeSandFp = 10.99;
    public double largeSTTp = 10.99;
    public double largeMeatballp = 10.99;
    
    public double Smoothiesp = 4.50;
    public double ICp = 3.50;
    public double HCp = 3.50;
    public double Sodap = 2.50;
    public double BWp = 1.50;
    public double OJp = 3.50;
    public double Teap = 0.50;
    
    public double getTax (double subTotal){
        double caliTax = 0.0925;
        double tax = subTotal * caliTax;
        return tax;
    }
}
