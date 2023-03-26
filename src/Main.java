import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();
            int i = scanner.nextInt();
            if (i == 1) {
            System.out.println("Выводится команда 1");
            } else if (i == 2) {
                System.out.println("Выводится команда 2");
            } else if (i == 3) {
                System.out.println("Выводится команда 3");
            } else if (i == 0) {
                System.out.println("Выход.");
                break;
            } else {
                System.out.println("К сожалению, такой команды нет. Попробуйте ещё раз.");
        }
        }
    }
    static void printMenu() {
        System.out.println("Выберите опцию: ");
        System.out.println("1 - Ввести количество шагов за определённый день;");
        System.out.println("2 - Изменить цель по количеству шагов в день;");
        System.out.println("3 - Напечатать статистику за определённый месяц;");
        System.out.println("0 - Выйи из приложения.");
    }

}