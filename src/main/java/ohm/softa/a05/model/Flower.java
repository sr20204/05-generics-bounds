package ohm.softa.a05.model;

public class Flower<T> extends Plant<T> {

    private PlantColor color;
    public Flower(PlantColor color){
        if(color == PlantColor.GREEN){
            throw new RuntimeException("Shrub cant be green");
        }
        else{
            this.color = color;
        }
    }

    @Override
    public int compareTo(T o) {
        return 0;
    }
    @Override
    public boolean equals(Object obj) {
        Flower t = (Flower) obj;
        return t.getHeight() == getHeight();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Name: " + getName() + " Height: " + getHeight() + " Family" + getFamily();
    }

    @Override
    public PlantColor getColor() {
        return color;
    }
}
