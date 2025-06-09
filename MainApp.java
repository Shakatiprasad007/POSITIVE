public class MainApp {
    public static void main(String[] args) {
        SignCheck checker = new SignCheck();

        int[] testNumbers = {10, -5, 0};

        for (int num : testNumbers) {
            System.out.println("Input: " + num + " -> " + checker.checkSign(num));
        }
    }
}
