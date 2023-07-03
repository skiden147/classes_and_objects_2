public class BmiService {

    public double calculate(double weightKilograms, double heightMeters) {
        double bmi = weightKilograms / (heightMeters * heightMeters);
        return (int) bmi;
    }

}
