class recursion1 {
    static public void rec(int a) {
        if (a <= 10) {
            System.out.println(a);
            a = a + 1;
            rec(a);
        }

    }

    public static void main(String[] args) {
        rec(0);
    }
}