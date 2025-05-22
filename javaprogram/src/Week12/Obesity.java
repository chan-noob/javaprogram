package Week12;

public class Obesity {
    private double height;
    private double weight;
    private double bmi;
    private double std_weight;

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double calcstd_weight() {
        std_weight = (height - 100) * 0.9;
        return std_weight;
    }

    public double calcBmi() {
        bmi = (weight - std_weight) / std_weight * 100;
        return bmi;
    }

    public String printBmi() {
        if (bmi < -20) {
            return "저체중";
        }
        if (bmi >= 50) {
            return "고도비만";
        }
        if (bmi >= 30) {
            return "중증 비만";
        }
        if (bmi >= 20) {
            return "경도비만";
        }
        return "정상";
    }
}