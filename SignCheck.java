public class SignCheck {
    public String checksign(int number) {
        if (number > 0)
            return "Positive";
        else if (number < 0)
            return "Negative";
        else
            return "Zero";
    }

    public static void main(String[] args) {
        SignCheck checker = new SignCheck();

        int[] testNumbers = {10, -5, 0};

        for (int num : testNumbers) {
            System.out.println("Input: " + num + " -> " + checker.checksign(num));
        }
    }
}
