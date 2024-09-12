
package alcaya.it2b;

import java.util.Scanner;


public class ScholarshipApplication{


    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
      
               
        System.out.print("Enter number of Applications :");
        int numofApplications = sc.nextInt();
        
        Application[]applications = new Applications[numofApplications];
        
        
        for (int i = 0 ; i < numofApplications ; i++){
            System.out.print("Enter details of application" + + (i + 1) + ":");
            
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();  

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("GPA: ");
            double gpa = scanner.nextDouble();

            System.out.print("Annual Family Income: ");
            double annualFammilyIncome= scanner.nextDouble();

            System.out.print("Community Service Hours: ");
            int communityServiceHours = scanner.nextInt();
            applications[i] = new Application(id, name, gpa, annualFamilyIncome, communityServiceHours)
        }

        System.out.println("\nID    Name   GPA     Annual Family Income  Community Service Hours");

        for (Application app : applications) {
            app.display();
        }

       scanner.close();
    }
}
            
       
        
        
