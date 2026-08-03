#include <iostream>
using namespace std;

int main() {
    int n, start;
    cin >> n >> start;

    int ans = 0;

    for (int i = 0; i < n; i++) {
        int num = start + 2 * i;
        ans = ans ^ num;
    }

    cout << ans << endl;

    return 0;
}