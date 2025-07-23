
package activity1;

import java.util.Scanner;

public class Activity1 {

    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       
       String name;
        float science, history, math, soc, arts, totalmarks;
        float totalpercentage;
     
        
        System.out.println("Enter name:");
        name=input.nextLine();
        
        System.out.println("Enter marks in Science:");
        science=input.nextInt();
        
         System.out.println("Enter marks in History:");
        history=input.nextInt();
        
         System.out.println("Enter marks in Math:");
        math=input.nextInt();
        
         System.out.println("Enter marks in Soc:");
        soc=input.nextInt();
        
         System.out.println("Enter marks in Arts:");
        arts=input.nextInt();
        
        
        totalmarks = science + history + math + soc + arts;
        
        totalpercentage = totalmarks / 5;
        System.out.println("Total Marks:"+ totalmarks);
        System.out.println("Total Percentage: "+ totalpercentage);
      
          
        if (totalpercentage >= 91 && totalpercentage <= 100) {
            System.out.println("Remarks: Excellent");
        } else if (totalpercentage >= 86 && totalpercentage <= 90.9) {
              System.out.println("Remarks: Very Good");
        } else if (totalpercentage >= 81 && totalpercentage <= 85.9) {
               System.out.println("Remarks: Good");
        } else if (totalpercentage >= 76 && totalpercentage <= 80.9) {
                System.out.println("Remarks: Fair");
        } else if (totalpercentage >= 71 && totalpercentage <= 75.9) {
               System.out.println("Remarks: Poor");
        } 
       

        if (totalpercentage <= 70) {
            System.out.println("Remarks: Fail");
            System.out.println("Try Again " + name + ".");
        } else {
            System.out.println("Congrats " + name + " you Passed.");
        }

    }
    
}
