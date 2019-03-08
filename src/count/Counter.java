package count;

public class Counter {

    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++) {
            System.out.println(getString(i));
        }
    }

    public static String getString(int i) {
        if(i % 3 == 0 && i % 5 == 0) {
            return "FizzBuzz";
        } else if(i % 3 == 0) {
            return "Fizz";
        } else if(i % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(i);
        }
    }
}