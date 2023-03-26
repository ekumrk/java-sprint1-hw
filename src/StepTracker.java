import java.util.Scanner;

class StepTracker {
    Scanner scanner;
    MonthData monthToData[] = new MonthData[12];

    StepTracker(Scanner scan) {
        scanner = scan;

        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }
    void addNewNumberStepsPerDay() {
        System.out.println("Выберите месяц: 1 - январь; 2 - февраль; 3 - март; 4 - апрель, 5 - май; 6 - июнь; 7 - июль; 8 - август; 9 - сентябрь; 10 - октябрь; 11 - ноябрь; 12 - декабрь.")

    }
}