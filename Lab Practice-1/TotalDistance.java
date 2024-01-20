import java.util.Scanner; 
 
public class BallDistance { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
 
        System.out.print("Enter the height (Y) in meters: "); 
        double height = scanner.nextDouble(); 
 
        double g = 9.8; 
 
        double totalDistance = calculateTotalDistance(height, g); 
 
        System.out.printf("The total distance traversed by the ball is: %.2f meters%n", totalDistance); 

        scanner.close(); 
    } 

    private static double calculateTotalDistance(double initialHeight, double 
gravity) { 
        double totalDistance = 0; 
        double currentHeight = initialHeight; 

        for (int i = 0; i < 3; i++) { 
            double bounceDistance = calculateBounceDistance(currentHeight, 
gravity); 

            totalDistance += bounceDistance; 
 
            currentHeight = bounceDistance / 2; 
        } 
return totalDistance; 
} 

private static double calculateBounceDistance(double height, double gravity) 
{ 

double initialVelocity = Math.sqrt(2 * gravity * height); 
double bounceDistance = (initialVelocity * initialVelocity) / (2 * 
gravity); 
return bounceDistance; 
} 
} 
