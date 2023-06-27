package ohm.softa.a05.tests.models;

import ohm.softa.a05.model.*;
import ohm.softa.a05.utils.PlantBedUtility;
import org.apache.logging.log4j.core.config.plugins.visitors.PluginBuilderAttributeVisitor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.Flow;

import static org.junit.jupiter.api.Assertions.*;

class ShrubTest {

    @BeforeEach
    void setUp() {

    }


    @Test
    void TestSetupColor() {
        Flower flo = new Flower(PlantColor.YELLOW,1.0,"Dave","Plants");
        Flower bo = new Flower(PlantColor.RED,1.0,"Rave","Plants");
        PlantBed<Flower> bed = new PlantBed<>();
        bed.add(flo);
        bed.add(bo);
        for(Flower o : bed){
            System.out.println(o);
        }

    }
    @Test
    void TestColorFilter(){

        Flower flo = new Flower(PlantColor.YELLOW,1.0,"Dave","Plants");
        Flower bo = new Flower(PlantColor.RED,1.0,"Rave","Plants");
        PlantBed<Flower> bed = new PlantBed<>();
        bed.add(flo);
        bed.add(bo);
        PlantBed<Flower> onlyRed = new PlantBed<>();
        onlyRed.add(bo);
        assert onlyRed.size() == bed.getPlantsByColor(PlantColor.RED).size();
        for(Flower o : bed.getPlantsByColor(PlantColor.RED)){
            assert o.getColor() == PlantColor.RED;
        }
    }
    @Test
    void TestRepot(){
        Flower flo = new Flower(PlantColor.YELLOW,1.0,"Dave","Plants");
        Flower bo = new Flower(PlantColor.RED,1.0,"Rave","Plants");
        PlantBed<Flower> bed = new PlantBed<>();
        PlantBed<Plant> plbed = new PlantBed<>();
        bed.add(flo);
        bed.add(bo);
        Shrub sh = new Shrub(PlantColor.GREEN);
        plbed.add(sh);
        for(Flower p : bed)
        {
            System.out.println("Flower1 " + p);
        }

        PlantBedUtility.repot(bed, PlantColor.YELLOW, plbed);
        for(Flower p : bed)
        {
            System.out.println("Flower2 " + p);
        }
        for(Plant p : plbed){
            System.out.println("Plant " + p);
        }
    }
}