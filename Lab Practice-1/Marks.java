import java.util.Scanner; 
public class StudentResultCalculator { 
public static void main(String[] args) { 
Scanner scanner = new Scanner(System.in); 

System.out.println("Enter marks for each subject:"); 

        double subject1, subject2, subject3, subject4, subject5; 

        System.out.print("Subject 1: "); 
        subject1 = scanner.nextDouble(); 
 
        System.out.print("Subject 2: "); 
        subject2 = scanner.nextDouble(); 
 
        System.out.print("Subject 3: "); 
        subject3 = scanner.nextDouble(); 
 
        System.out.print("Subject 4: "); 
        subject4 = scanner.nextDouble(); 
 
        System.out.print("Subject 5: "); 
        subject5 = scanner.nextDouble(); 

        double total = subject1 + subject2 + subject3 + subject4 + subject5; 
        double average = total / 5; 
        double percentage = (total / 500) * 100; 
 
        System.out.printf("Total marks: %.2f%n", total); 
        System.out.printf("Average marks: %.2f%n", average); 
        System.out.printf("Percentage: %.2f%%%n", percentage); 
 
        scanner.close(); 
    } 
} 
