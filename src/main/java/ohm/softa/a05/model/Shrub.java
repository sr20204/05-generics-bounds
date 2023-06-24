package ohm.softa.a05.model;

public class Shrub<T> extends Plant<T> {

    private PlantColor color;
    @Override
    public int compareTo(T o) {
        return 0;
    }

    public Shrub(PlantColor color){
        if(color != PlantColor.GREEN){
            throw new RuntimeException("Shrub must be green");
        }
        else{
            this.color = color;
        }
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public PlantColor getColor() {
        return color;
    }
}
