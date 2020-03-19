public class AppMain {
    public static int add(int... list) {
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        return sum;
    }

    public static void main(String args[]) {
        int sum = add(1, 2, 3, 4, 5, 6);
        System.out.println(sum);
    }

}
