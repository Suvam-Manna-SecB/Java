// Write a Java program to count prime numbers in an array.

public class CountPrimeNumbers {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        int primeCount = countPrimeNumbers(array);

        System.out.println("Number of prime numbers in the array: " + primeCount);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int countPrimeNumbers(int[] array) {
        int count = 0;

        for (int num : array) {
            if (isPrime(num)) {
                count++;
            }
        }

        return count;
    }
}
