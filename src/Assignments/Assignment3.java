package Assignments;
import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("****Welcome to the Metric Converter app!****");
        System.out.println("Do you have a metric that needs to be converted? ");
        String decision = scanner.next(); 
        if (decision == "yes") {
            System.out.println("Enter a metric that needs converting (yards, pounds, years, liters");
            String metric = scanner.next();
            System.out.println("How many? ");
            int Metrics = scanner.nextInt();
            
            
            switch (metric) {
                case ("yards"):
                System.out.println("Feet: There are " + 3 * Metrics + " feet in " + Metrics + " yard(s).");
                System.out.println("Inches: There are " + 36 * Metrics + " inches in " + Metrics + " yard(s).");
                break;
                case("pounds"):
                System.out.println("Ounces: There are " + 16 * Metrics + " ounces " + Metrics + " pound(s).");
                System.out.println("Grams: There are " + 453.5923 * Metrics + " grams in " + Metrics + " pound(s).");
                break;
                case("years"):
                System.out.println("Months: There are " + 12 * Metrics + " months in " + Metrics + " year(s).");
                System.out.println("Weeks: There are " + 52 * Metrics + " weeks in " + Metrics + " year(s).");
                System.out.println("Days: There are " + 365.25 * Metrics + " days in " + Metrics + " year(s).");
                break;
                case("liters"):
                System.out.println("Gallons: There are " + 0.26417 * Metrics + " gallons in " + Metrics + " liter(s).");
                System.out.println("Ounces: There are " + 33.81402 * Metrics + " ounces in " + Metrics + " liter(s).");
                break;
            
                

            }
            System.out.println();
            System.out.println("Would you like to convert something else? ");
            String decision2 = scanner.next();
            scanner.close();
            if (decision2 == "yes");
                
            

        

        } else if (decision == "no") {
            System.out.println("No problem. You have exited the app.");
         }
        }
        
}
