import java.util.Scanner;

class StepTracker {
    Scanner scanner;
    MonthData[] monthToData = new MonthData[12];
    int goalByStepsPerDay = 10000;
    Converter converter = new Converter();
    //Привет, Вадим. Приятно познакомиться! Лишнее поле убрал. Благодарю за ревью!

    StepTracker(Scanner scan) {
        scanner = scan;

        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }
    void addNewNumberStepsPerDay() {
        System.out.println("Выберите месяц: 1 - январь; 2 - февраль; 3 - март; 4 - апрель, 5 - май; 6 - июнь; 7 - июль; 8 - август; 9 - сентябрь; 10 - октябрь; 11 - ноябрь; 12 - декабрь.");
        int month = scanner.nextInt();
        if (month < 1) {
            System.out.println("Месяц не может быть меньше 1. Попробуйте ещё раз.");
            return;
        } else if (month > 12) {
            System.out.println("Месяц не может быть больше 12. Попробуйте ещё раз.");
            return;
        }
        System.out.println("Введите день от 1 до 30 (включительно):");
        int day = scanner.nextInt();
        if (day < 1) {
            System.out.println("День месяца не может быть меньше 1. Попробуйте ещё раз.");
            return;
        } else if (day > 30) {
            System.out.println("День месяца не может быть больше 30. Попробуйте ещё раз.");
            return;
        }
        System.out.println("Введите количество пройденных шагов за указанный день месяца:");
        int steps = scanner.nextInt();
        if (steps < 0) {
            System.out.println("Количество шагов за день не может быть меньше нуля.");
            return;
        }
        MonthData monthData = monthToData[month - 1];
        monthData.days[day - 1] = steps;
        if (day < 10 && month < 10) {
            System.out.println("Вы добавили " + steps + " шагов за 0" + day + ".0" + month + ".");
        } else if (day >= 10 && month < 10) {
            System.out.println("Вы добавили " + steps + " шагов за " + day + ".0" + month + ".");
        } else if (day < 10 && month >= 10) {
            System.out.println("Вы добавили " + steps + " шагов за 0" + day + "." + month + ".");
        } else {
            System.out.println("Вы добавили " + steps + " шагов за " + day + "." + month + ".");
        }
    }
    void changeStepGoal() {
        System.out.println("Текущая цель шагов за день: " + goalByStepsPerDay + ". Введите новую цель:");
        int newGoalByStepsPerDay = scanner.nextInt();
        if (newGoalByStepsPerDay <= 0) {
            System.out.println("Цель шагов за день не может быть меньше или равна нулю. Попробуйте ещё раз.");
            return;
        }
        goalByStepsPerDay = newGoalByStepsPerDay;
        System.out.println("Ваша новая цель шагов за день: "+ goalByStepsPerDay + ".");
    }
    void printStatistics() {
        System.out.println("Выберите месяц: 1 - январь; 2 - февраль; 3 - март; 4 - апрель, 5 - май; 6 - июнь; 7 - июль; 8 - август; 9 - сентябрь; 10 - октябрь; 11 - ноябрь; 12 - декабрь.");
        int month = scanner.nextInt();
        if (month < 1) {
            System.out.println("Месяц не может быть меньше 1. Попробуйте ещё раз.");
            return;
        } else if (month > 12) {
            System.out.println("Месяц не может быть больше 12. Попробуйте ещё раз.");
            return;
        }
        MonthData monthData = monthToData[month - 1];

        monthData.printDaysAndStepsFromMonth();
        System.out.println("Общее количество шагов за месяц: " + monthData.sumStepsFromMonth());
        System.out.println("Максимальное количество шагов в день за данный месяц: "+ monthData.maxSteps());
        System.out.println("Среднее количество шагов за месяц: "+ monthData.middleStepsPerMonth());
        System.out.println("Пройденная дистанция в км: "+ converter.convertToKm(monthData.sumStepsFromMonth()));
        System.out.println("Количество сожжённых калорий: " + converter.convertStepsToKilocalories(monthData.sumStepsFromMonth()));
        System.out.println("Лучшая серия: "+ monthData.bestSeries(goalByStepsPerDay) + " дней подряд превышали ежедневную цель.");
        System.out.println();
    }

}