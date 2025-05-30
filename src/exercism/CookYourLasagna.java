package exercism;
public class CookYourLasagna {
    private static final int EXPECTED_MINUTES_IN_OVEN = 40;
    private static final int PREPARATION_TIME_PER_LAYER = 2;

    public int expectedMinutesInOven() {
        return EXPECTED_MINUTES_IN_OVEN;
    }

    public int remainingMinutesInOven(int minutes) {
        return expectedMinutesInOven() - minutes;
    }

    public int preparationTimeInMinutes(int layers) {
        return layers * PREPARATION_TIME_PER_LAYER;
    }

    public int totalTimeInMinutes(int layers, int minutes) {
        return preparationTimeInMinutes(layers) + minutes;
    }

    public static void main(String[] args) {
        CookYourLasagna lasagna = new CookYourLasagna();
        System.out.println(lasagna.totalTimeInMinutes(1,30));

    }

}


