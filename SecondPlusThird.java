
import java.util.ArrayList;
import java.util.Scanner;

public class SecondPlusThird {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("ENTER A NUMBER");

        ArrayList<Integer> number = new ArrayList<>();
        while (true) {
            
           
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0) {
                break;
            }
            
            number.add(num);
        }

        System.out.println(number.get(1)+number.get(2));
    }
}

