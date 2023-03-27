class MonthData {
    int days[] = new int[30];

    void printDaysAndStepsFromMonth() {
        for (int i = 0; i < days.length; i++) {
            System.out.println((i + 1) + " день: " + days[i]);
        }
    }

    int sumStepsFromMonth() {
        int stepsSum = 0;
        for (int i = 0; i < days.length; i++) {
            stepsSum = days[i] + stepsSum;
        }
        return stepsSum;
    }

    int middleStepsPerMonth() {
        int middleSteps = 0;
        int stepsSum2 = 0;
        for (int i = 0; i < days.length; i++) {
            stepsSum2 = days[i] + stepsSum2;
            middleSteps = stepsSum2 / 30;
        }
        return middleSteps;
    }

    int maxSteps() {
        int maxSteps = 0;
        for (int i = 0; i < days.length; i++) {
            if (days[i] > maxSteps) {
                maxSteps = days[i];
            }
        }
        return maxSteps;
    }

    int bestSeries(int goalByStepsPerDay) {
        int currentSeries = 0;
        int finalSeries = 0;
        for (int i = 0; i < days.length; i++) {
            if (days[i] >= goalByStepsPerDay) {
                currentSeries = currentSeries + 1;
                if (finalSeries < currentSeries) {
                    finalSeries = currentSeries;
                }
            } else {
                currentSeries = 0;
            }
        }
        return finalSeries;
    }

}