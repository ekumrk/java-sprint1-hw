class Converter {

    int convertToKm(int steps) {
         int stepsToCm = steps * 75;
         int stepsToKm = stepsToCm / 100000;
         return stepsToKm;
    }

    int convertStepsToKilocalories(int steps) {
        int stepsToKal = steps * 50;
        int stepsToKkal = stepsToKal / 1000;
        return stepsToKkal;
    }
}