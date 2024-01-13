#include <stdio.h>
int main() {
    float marks[5], total, average, percentage;

    printf("Enter marks for Subject 1: ");
    scanf("%f", &marks[0]);

    printf("Enter marks for Subject 2: ");
    scanf("%f", &marks[1]);

    printf("Enter marks for Subject 3: ");
    scanf("%f", &marks[2]);

    printf("Enter marks for Subject 4: ");
    scanf("%f", &marks[3]);

    printf("Enter marks for Subject 5: ");
    scanf("%f", &marks[4]);

    total = marks[0] + marks[1] + marks[2] + marks[3] + marks[4];
    average = total / 5;
    percentage = (total / (5 * 100)) * 100;

    printf("Total marks: %.2f\n", total);
    printf("Average marks: %.2f\n", average);
    printf("Percentage: %.2f%%\n", percentage);

    return 0;
}
