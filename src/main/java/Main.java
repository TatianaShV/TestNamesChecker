
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NamesChecker namesChecker = new NamesChecker();
        while (true) {
            System.out.println("Введите имя с большой буквы");
            String name = scanner.nextLine();
            if ("end".equals(name)) {
                System.out.println("Программа завершена");
                break;
            } else {
                namesChecker.maxName(name);
            }
        }
    }
}




