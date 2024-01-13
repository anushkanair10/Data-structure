#include <stdio.h>
#include <math.h>

int main() {

    const double g = 9.8;  
    double initialHeight, totalDistance = 0.0;
    int numBounces = 3;  

    printf("Enter the initial height (in meters): ");
    scanf("%lf", &initialHeight);

    for (int bounce = 1; bounce <= numBounces; bounce++) {
     
        double upwardDistance = initialHeight;

        double timeOfFlightUpward = sqrt(2 * upwardDistance / g);

        double velocityAtTop = g * timeOfFlightUpward;

        double downwardDistance = 0.5 * g * pow(timeOfFlightUpward, 2);

        double distanceForBounce = upwardDistance + downwardDistance;

        totalDistance += distanceForBounce;

        initialHeight = 0.5 * initialHeight;  

        printf("Distance for bounce %d: %.2f meters\n", bounce, distanceForBounce);
    }
    printf("Total distance traversed after %d bounces: %.2f meters\n", numBounces, totalDistance);

    return 0;
}
