public class ArmstrongNumber {
    public boolean isArmstrong(int n) {
        int numDigits = countDigits(n);
        int sum = calculateSum(n, numDigits);
        return sum == n;
    }

    private int countDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return 1 + countDigits(n / 10);
    }

    private int calculateSum(int n, int numDigits) {
        if (n == 0) {
            return 0;
        }
        int digit = n % 10;
        return (int) (Math.pow(digit, numDigits) + calculateSum(n / 10, numDigits));
    }

    public static void main(String[] args) {
        ArmstrongNumber solution = new ArmstrongNumber();
        int num = 153;
        boolean isArmstrong = solution.isArmstrong(num);
        if (isArmstrong) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
}
