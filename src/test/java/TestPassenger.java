import ie.atu.JDBC.Passenger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestPassenger {
    Passenger mypass;
    Passenger mypass2;
    Passenger mypass3;

    @BeforeEach
    void setup(){
        mypass = new Passenger("Ms", "Anzelina", "Harevica");
    }

    @Test
    void ConstructorSuccess(){
        assertEquals("Ms", mypass.getTitle());
        assertEquals("Anzelina", mypass.getFirstName());
        assertEquals("Harevica", mypass.getLastName());
    }

    @Test
    void testTitleFail(){
        //(Mr, Ms, Mrs)
        assertThrows(IllegalArgumentException.class, ()->{mypass = new Passenger("Dr", "Eoin", "Ager");});
    }
}
