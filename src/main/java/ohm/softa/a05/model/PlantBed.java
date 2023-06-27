package ohm.softa.a05.model;

import ohm.softa.a05.collections.SimpleList;
import ohm.softa.a05.collections.SimpleListImpl;

import java.util.Iterator;

public class PlantBed<T extends Plant> implements SimpleList<T> {
    SimpleList<T> plants;

    public PlantBed(){
        plants = new SimpleListImpl<>();
    }
    @Override
    public void add(T o) {
    plants.add(o);
    }
    public SimpleList<T> getPlantsByColor(PlantColor color){
       SimpleList<T> temp = new SimpleListImpl<>();
       for(T o : plants){
           if(o.getColor() == color)
           {
               temp.add(o);
           }
       }
       return temp;

    }

    @Override
    public int size() {
        return plants.size();
    }

    @Override
    public Iterator<T> iterator() {
        return plants.iterator();
    }
    public T remove(PlantColor o){
        SimpleList<T> temp = new SimpleListImpl<>();
        T b = null;
        for(T i : plants){
            if(i.getColor() != o){
                temp.add(i);
            }
            else{
                b = i;
            }
        }
        plants = temp;
        return b;
    }
}
