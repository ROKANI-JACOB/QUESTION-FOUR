/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ue.kidsmeal;

/**
 *
 * @author User
 */
public class Atelecomcompany {
        public static void main(String[] args) {
            // Initial amount loaded by the subscriber
        double loadedAmount = 10000; 

        // Service charge rate
        double serviceChargeRate = 0.10; 

        // Call duration in minutes
        int callDurationInMinutes = 5; 

        
        double serviceCharge = loadedAmount * serviceChargeRate;

        // Calculate the usable balance after service charge
        double usableBalance = loadedAmount - serviceCharge;

        // Calculate the total cost of the call
        double totalCallCost = callDurationInMinutes * 60 * 200; // 200 UGX per second
        // Calculate the remaining balance
        double remainingBalance = usableBalance - totalCallCost;

        // Print the results
        System.out.println("Initial Loaded Amount: " + loadedAmount + " UGX");
        System.out.println("Service Charge (10%): " + serviceCharge + " UGX");
        System.out.println("Usable Balance after Service Charge: " + usableBalance + " UGX");
        System.out.println("Total Call Cost for " + callDurationInMinutes + " minutes: " + totalCallCost + " UGX");
        System.out.println("Remaining Balance: " + remainingBalance + " UGX");        
            
            
            
            
            
            
            
            
            
   
}

    
}
