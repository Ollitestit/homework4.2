public class BmiService {
    public int calculate(double heightM, double weightKg) {
        double heightSquared = Math.pow(heightM, 2);
        double index = weightKg / heightSquared;
        return (int) index;
    }
}
