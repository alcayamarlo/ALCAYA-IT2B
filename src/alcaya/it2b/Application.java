
package alcaya.it2b;

import java.util.Scanner;


class Application {
    
    int id;
    String name;
    double gpa;
    double annualFammilyIncome;
    int communityServiceHours;
   
   public Application(int id, String name ,double gpa, double annualFamilyIncome, int communityServiceHours ){
      
      this.id = id;
      this.name = name; 
      this.gpa = gpa;
      this.annualFammilyIncome= annualFamilyIncome;
      this.communityServiceHours = communityServiceHours;
   }  
   
    public void display() {
        System.out.printf("%-5d %-6s %-6.1f P%-12.0f %-20d\n", id, name, gpa, annualFammilyIncome, communityServiceHours);
   }
}
