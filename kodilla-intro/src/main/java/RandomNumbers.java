public class RandomNumbers {
    public static void main(String[] args) {
        for (int i = 0; i <= 30; i++) ;

        }

    public int sumNumber(int[] numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i = 5000){
            result = result + numbers[i];
        }
        return result;
    }
}