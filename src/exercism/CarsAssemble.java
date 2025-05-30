package exercism;

public class CarsAssemble {
    public double productionRatePerHour(int speed) {
        if (speed <= 4) {
            return speed * 221;
        } else if (speed <= 8) {
            return speed * 221 - ((speed * 221) * 0.1);
        } else if (speed == 9) {
            return speed * 221 - ((speed * 221) * 0.2);
        } else {
            return speed * 221 - ((speed * 221) * 0.23);
        }
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed) / 60;
    }

    public static void main(String[] args) {
        CarsAssemble assemble = new CarsAssemble();
        System.out.println(assemble.productionRatePerHour(6));
        System.out.println(assemble.workingItemsPerMinute(6));
    }
}
