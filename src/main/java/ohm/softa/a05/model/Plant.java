package ohm.softa.a05.model;

import java.lang.Comparable;

public abstract class Plant<T> implements Comparable<T> {
    private double height;
    private String family;
    private String name;

    public double getHeight() {
        return height;
    }
    public void setHeight(double height)
    {
        this.height = height;
    }

    public String getFamily() {
        return family;
    }
    public void setName(String name)
    {
        this.name = name;
    }


    public String getName() {
        return name;
    }
    public void setFamily(String family)
    {
        this.family = family;
    }

    public abstract PlantColor getColor();

}
