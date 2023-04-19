package oop.homework.hw1.products.hygiena;

// туалетная бумага
public class ToiletPaper extends Hygiena {
    private int countOfLayer;

    public ToiletPaper(String name, double cost, double quantity, String measure, int countOfLayer) {
        super(name, cost, quantity, measure);
        this.countOfLayer = countOfLayer;
    }

    public int getCountOfLayer() {
        return countOfLayer;
    }

    public void setCountOfLayer(int countOfLayer) {
        this.countOfLayer = countOfLayer;
    }

    @Override
    public String toString() {
        return "ToiletPaper{" +
                "countOfLayer=" + countOfLayer +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", quantity=" + quantity +
                ", measure='" + measure + '\'' +
                '}';
    }
}
