#include <iostream>
using namespace std;

int main() {
    int num;
    cin >> num;

    if (num <= 1) {
        cout << "false";
        return 0;
    }

    int sum = 1;

    for (int i = 2; i <= num / 2; i++) {
        if (num % i == 0) {
            sum += i;
        }
    }

    if (sum == num)
        cout << "true";
    else
        cout << "false";

    return 0;
}