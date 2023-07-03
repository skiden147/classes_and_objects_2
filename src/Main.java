public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weightKilograms = 98;
        double heightMeters = 1.87;
        double add bmi = service.calculate(weightKilograms, heightMeters);
        System.out.println("Индекс массы вашего тела составляет:" + bmi);
    }
}
