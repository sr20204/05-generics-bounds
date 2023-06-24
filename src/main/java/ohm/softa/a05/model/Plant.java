package ohm.softa.a05.model;

import java.lang.Comparable;

public abstract class Plant<T> implements Comparable<T> {
    private double height;
    private String family;
    private String name;

    public double getHeight() {
        return height;
    }

    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }
    public abstract PlantColor getColor();

}
