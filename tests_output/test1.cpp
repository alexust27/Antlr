#include <iostream>
#include <string>

using namespace std;

int fac(int n) {
    if (n == 0) return 1;
    if ((n > 0)) {
       return (n * fac((n - 1)));
    }
}

int f(int null, int null) {
}

int fac2(int n) {
    if (n == 0) return 1;
    if ((n > 0)) {
       return (n * fac((n - 1)));
    }
    if ((n < 0)) {
       return (n * fac((n + 1)));
    }
}

int fff = ((1 - 2) - 3);


int gcd(int x, int y) {
    if ((x == 0)) {
       return y;
    }
    return gcd(y, (x % y));
}



string doo(string a) {
    return (a + a);
}

string concat(string s1, string s2) {
    return (s1 + s2);
}

int A = 13;

int chToInt(char ch) {
    return (ch + 100);
}

int bb(bool x) {
    if (!x) {
       return 2;
    }
    if (x) {
       return -1;
    }
}

bool less(int a, int b) {
    if ((a < b)) {
       return true;
    }
    if ((a >= b)) {
       return false;
    }
}

int C(int n, int m) {
    if (n == 1 && m == 1) return 1;
    if (m == 0) return 1;
    if (n == 1) return 1;
    if ((n < m)) {
       return C(n, n);
    }
    if ((n >= m)) {
       return (C((n - 1), (m - 1)) + C((n - 1), m));
    }
}

int main(){}