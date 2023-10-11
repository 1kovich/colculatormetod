import java.util.Scanner;

public class Main {
    public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("(\"Выберите операции 1 это + , 2 это - , 3 это * , 4 это /\");");
            int operation = scanner.nextInt();

            if (operation == 1) {
                koshu();
            } else if (operation == 2) {
                kemitu();
            }else if (operation == 3){
                koboytu();
            } else if (operation == 4){
                bolu();
            }
        }
        static void koshu() {
            Scanner scanner = new Scanner(System.in);
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            System.out.println(b + c);
        }
        static void kemitu() {
            Scanner scanner = new Scanner(System.in);
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            System.out.println(b - c);
        }
        static void koboytu() {
            Scanner scanner = new Scanner(System.in);
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            System.out.println(b * c);
        }

        static void bolu() {
            Scanner scanner = new Scanner(System.in);
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            System.out.println(b / c);
        }
    }
