
class Overloading {
    static int add(int a, int b) {
        int sum = a + b;

        return sum;
    }

    static int add(int a, int b, int c) {
        int sum = a + b + c;
        return sum;
    }

    public static void main(String args[]) {
        int t = Overloading.add(2, 3);
        int s = Overloading.add(2, 3, 7);

        System.out.println(t);
        System.out.println(s);

    }
}