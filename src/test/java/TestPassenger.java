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
        assertThrows(IllegalArgumentException.class, ()->{mypass = new Passenger("Dr", "Anzelina", "Harevica");});
    }


    @Test
    void testTitleSuccess(){
        assertEquals("Ms", mypass.getTitle());
        Passenger  mypass2 = new Passenger("Mr", "Eoin", "Harevica");
        assertEquals("Mr", mypass2.getTitle());
        Passenger  mypass3 = new Passenger("Mrs", "Anzelina", "Ager");
        assertEquals("Mrs", mypass3.getTitle());

    }

    @Test
    void testShortFirstName(){
        assertThrows(IllegalArgumentException.class, () -> {mypass = new Passenger("Mr", "Eo", "Ager");});
    }
}
