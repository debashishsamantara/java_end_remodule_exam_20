import java.util.InputMismatchException;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        String[] items = new String[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of foods");
        for (int i = 0; i < items.length; i++) {
            items[i] = sc.nextLine();
        }
        try {
            System.out.println("Enter index of food item:");
            int index = sc.nextInt();
            System.out.println("Enter how much quantity you want:");
            String quantity = sc.nextLine();
            int q = Integer.parseInt(quantity);
            System.out.println(items[index]);
        } catch (InputMismatchException e) {
            throw new InputMismatchException("User entered non-numeric input");
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Entered charater(s) is not a number");
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException("Array out of bounds");
        }
    }
}
