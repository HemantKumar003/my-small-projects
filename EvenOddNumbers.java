public class EvenOddNumbers {
    public static void main(String[] args) {
        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Even numbers:");
        for (int i = 1; evenCount < 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                evenCount++;
            }
        }

        System.out.println("\nOdd numbers:");
        for (int i = 1; oddCount < 10; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                oddCount++;
            }
        }
    }
}
