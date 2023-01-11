public class App {public static int maxNumber(int[] arr) {
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    return max;
}

public static int minNumber(int[] arr) {
    int min = arr[0];
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] < min) {
            min = arr[i];
        }
    }
    return min;
}

public static int sumArray(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
        sum += arr[i];
    }
    return sum;
}

public static void main(String[] args) {
    int[] testArr = {200,4535, 30, 403, 5434, 3431, 436,45345,45345,564};

    System.out.println("Max Number: " + maxNumber(testArr));
    System.out.println("Min Number: " + minNumber(testArr));
    System.out.println("Sum: " + sumArray(testArr));
}
}
