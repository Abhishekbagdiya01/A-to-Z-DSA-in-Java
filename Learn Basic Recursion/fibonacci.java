public class fibonacci {
    static int _Fibonacci(int n) {
        if (n < 0) {
            return -1;
        }
        if (n == 0 || n == 1) {
            return n;
        }
        return _Fibonacci(n - 1) + _Fibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(_Fibonacci(4));
    }
}
