public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightInKg = 98; // вес в кг
        double heightInMeters = 1.87; // рост в м
        double bmi = service.calculate(weightInKg, heightInMeters); // bmi-индекс

        System.out.println(bmi);
    }
}
