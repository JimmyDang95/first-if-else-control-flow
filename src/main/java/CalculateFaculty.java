public class CalculateFaculty {

    public static void main(String[] args) {

        int number = 1;
        int result = calculate(number);
        System.out.println(result);
    }

    public static int calculate(int number) {
        int result = 1;
        int i = 1;
        while (i <= number) {
            System.out.println("i = " + i);
            result = result * i;
            System.out.println("result = " + result);
            i++;
        }
        return result;
    }
}
   /* public static int calculate(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
        }
    */


