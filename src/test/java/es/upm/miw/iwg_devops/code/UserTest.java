package es.upm.miw.iwg_devops.code;

import static org.junit.Assert.*;

import es.upm.miw.iwvg_devops.code.Fraction;
import es.upm.miw.iwvg_devops.code.User;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class UserTest {

    private User user;

    @Before
    public void setUp() {
        user = new User("123", "Jorge", "Muñoz", new ArrayList<>());
    }

    @Test
    public void testGetId() {
        assertEquals("123", user.getId());
    }

    @Test
    public void testGetName() {
        assertEquals("Jorge", user.getName());
    }

    @Test
    public void testSetName() {
        user.setName("Jorge");
        assertEquals("Jorge", user.getName());
    }

    @Test
    public void testGetFamilyName() {
        assertEquals("Muñoz", user.getFamilyName());
    }

    @Test
    public void testSetFamilyName() {
        user.setFamilyName("Muñoz");
        assertEquals("Muñoz", user.getFamilyName());
    }

    @Test
    public void testGetFractions() {
        assertNotNull(user.getFractions());
    }

    @Test
    public void testSetFractions() {
        List<Fraction> fractions = new ArrayList<>();
        fractions.add(new Fraction(1, 2));
        user.setFractions(fractions);

        assertEquals(1, user.getFractions().size());
    }

    @Test
    public void testAddFraction() {
        user.addFraction(new Fraction(1, 3));
        assertEquals(1, user.getFractions().size());
    }

    @Test
    public void testFullName() {
        assertEquals("Jorge Muñoz", user.fullName());
    }

    @Test
    public void testInitials() {
        assertEquals("J.", user.initials());
    }

    @Test
    public void testToString() {
        assertEquals("User{id='123', name='Jorge', familyName='Muñoz', fractions=[]}", user.toString());
    }
}

