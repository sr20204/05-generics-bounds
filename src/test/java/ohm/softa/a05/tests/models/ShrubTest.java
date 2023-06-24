package ohm.softa.a05.tests.models;

import ohm.softa.a05.model.Flower;
import ohm.softa.a05.model.PlantColor;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class ShrubTest {

    @BeforeEach
    void setUp() {
        Flower flo = new Flower(PlantColor.GREEN);
        assert(flo,flo.getColor() != PlantColor.GREEN)
    }

}