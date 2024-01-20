import java.util.Scanner; 
 
public class investment { 
    public static void main(String[] args) { 

        Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter the initial amount (Principal amount): "); 
        double principalAmount = scanner.nextDouble(); 
 
        System.out.print("Enter the interest rate (in percentage): "); 
        double interestRate = scanner.nextDouble(); 
 
        interestRate /= 100; 
 
        System.out.println("\nYear\tBalance"); 
 
        for (int year = 1; year <= 5; year++) { 
            double balance = principalAmount * Math.pow(1 + interestRate, year); 

            System.out.printf("%d\t%.2f%n", year, balance); 
        } 
        scanner.close(); 
    } 
}
