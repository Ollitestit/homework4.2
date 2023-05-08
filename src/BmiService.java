public class BmiService {
    public int calculate(double height_m, double weight_kg) {
        double x = Math.pow(height_m, 2);
        double index = weight_kg / x;
        return (int) index;
    }
}
