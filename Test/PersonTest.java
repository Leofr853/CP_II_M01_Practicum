import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
class PersonTest {
    Person s1;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
       s1 = new Person ("Leonardo", "Redigolo", "Mr","000001", 2001);
    }

    @org.junit.jupiter.api.Test
    void setFirstName() {
s1.setFirstName("Leonardo");
assertEquals("Leonardo", s1.getFirstName());
    }

    @org.junit.jupiter.api.Test
    void setLastName() {
        s1.setLastName("Redigolo");
        assertEquals("Redigolo", s1.getLastName());
    }

    @org.junit.jupiter.api.Test
    void setTitle() {
        s1.setTitle("Mr");
        assertEquals("Mr", s1.getTitle());
    }

    @org.junit.jupiter.api.Test
    void setID() {
        s1.setID("000001");
        assertEquals("000001", s1.getID());
    }

    @org.junit.jupiter.api.Test
    void setYearOfBirth() {
        s1.setYearOfBirth(2001);
        assertEquals(2001, s1.getYearOfBirth());
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        s1.setFirstName("Leonardo");
        assertEquals("Leonardo", s1.getFirstName());
    }

    @org.junit.jupiter.api.Test
    void getFullName() {
        s1.setFirstName("Leonardo");
        assertEquals("Leonardo", s1.getFirstName());
    }

    @org.junit.jupiter.api.Test
    void getFormalName() {
        s1.setFirstName("Leonardo");
        assertEquals("Leonardo", s1.getFirstName());
    }

    @org.junit.jupiter.api.Test
    void getAge() {
        s1.setFirstName("Leonardo");
        assertEquals("Leonardo", s1.getFirstName());
    }

    @org.junit.jupiter.api.Test
    void testGetAge() {
        s1.setFirstName("Leonardo");
        assertEquals("Leonardo", s1.getFirstName());
    }
}