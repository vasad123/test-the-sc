import java.util.Scanner;

public class Application {


    public static void end(String[] array) {
        int c[] = numToABC();
        for (int i = 0; i < array.length; i++) {
            int z = Integer.parseInt(array[i]);
            System.out.println((char) c[z] + " ");
        }
    }

    public static int[] numToABC() {
        char a = 65;
        int b[] = new int[26];
        for (int i = 0; i < b.length; i++) {

            b[i] = (int) a;
            a++;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String letter = "";
        do {

            System.out.println("Enter numbers  between 0 - 25 for end write exit");
            letter = sc.nextLine();

            if (!letter.equals("exit")) {
                String letterArray[] = letter.split("-");
                end(letterArray);
            }
        } while (!letter.equals("exit"));


    }
}
    