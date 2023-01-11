public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 176;
        double weight = 80;
        double iMT = service.calculate(height, weight);
        System.out.println("Ваш индекс тела: " + iMT);
    }
}
