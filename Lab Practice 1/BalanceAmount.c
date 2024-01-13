#include <stdio.h>
int main() {

    double principalAmount, annualInterestRate, balance;
    printf("Enter the principal amount: ");
    scanf("%lf", &principalAmount);

    printf("Enter the annual interest rate (in percentage): ");
    scanf("%lf", &annualInterestRate);
    annualInterestRate /= 100;

    for (int year = 1; year <= 5; year++) {
        balance = principalAmount * (1 + annualInterestRate);

        printf("Balance at the end of year %d: %.2f\n", year, balance);

        principalAmount = balance;
    }
    return 0;
}
