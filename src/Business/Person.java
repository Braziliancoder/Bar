package Business;

/**
 * Created by wizlamar on 25.06.17.
 */
public class Person {
    private int height;
    private double weight;

    public int individuellpegel;

    public Person(int height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public int getHigh() {
        return height;
    }

    public void setHigh(int high) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

        public double berechneIndividuellpegel(){

        individuellpegel = (int) (height * weight);
        System.out.println(individuellpegel);
        return individuellpegel;
    }

}
