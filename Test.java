public class Test {
    public static void main(String[] args) {
        int[] array1 = { 10, 20, 30, 40, 50 };
        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            sum = sum + array1[i];
        }
        System.out.println("Sum Of Array = " + sum);
    }
}
