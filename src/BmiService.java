public class BmiService {
    public double calculate(double height, double weight) {
        double iMT = (weight / ((height/100) * (height/100)));
        return iMT;
    }

}
