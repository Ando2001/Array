public class Problem {
    public static void main(String[] args) {

        int[] numbers = new int[1000];
        for (int i = 0; i < numbers.length; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
       // System.out.println(numbers);

    }
}
