public class SmallestNumber {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        int num3 = 3;
        int num4 = 8;
        int smallest = num1;

        if (num2 < smallest) {
            smallest = num2;
        }

        if (num3 < smallest) {
            smallest = num3;
        }

        if (num4 < smallest) {
            smallest = num4;
        }

        System.out.println("The smallest number is: " + smallest);
    }
}
