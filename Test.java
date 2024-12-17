public class Test {
    public static void main(String[] args) {
        int[] array1 = { 10, 20, 30, 40, 50 };
        int sum = 0;
        int length_of_array = array1.length;
        for (int i = 0; i < array1.length; i++) {
            sum = sum + array1[i];
        }
        System.out.println("Sum Of Array = " + sum);
        double average = sum / length_of_array;
        System.out.println("Average Of All Array Element = " + average);
    }
}
