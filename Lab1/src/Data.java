public class Data {
    private double sum = 0.0;
    private double max = -1000000;
    private double count = 0;
    public Data() {}

    public void addValue(double val){
        sum += val;
        count++;
        if (val > max){
            max = val;
        }
    }
    public double getAverage() {
        if (count != 0) {
            return sum / count;
        }
        else {return 0;}
    }
    public double getMax() {
        if (max != -1000000){
        return max;
        }
        else{
            return 0;
        }
    }
}
