package es.upm.miw.iwg_devops.code;

import static org.junit.Assert.*;

import es.upm.miw.iwvg_devops.code.Fraction;
import es.upm.miw.iwvg_devops.code.User;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import java.util.Arrays;

public class UserTest {

    private User user;

    @Test
    public void testGetId() {
        User user = new User("1", "Jorge", "Muñoz", new ArrayList<>());
        assertEquals("1", user.getId());
    }

    @Test
    public void testGetName() {
        User user = new User("1", "Jorge", "Muñoz", new ArrayList<>());
        assertEquals("Jorge", user.getName());
    }

    @Test
    public void testSetName() {
        User user = new User("1", "Jorge", "Muñoz", new ArrayList<>());
        user.setName("Alice");
        assertEquals("Alice", user.getName());
    }

    @Test
    public void testGetFamilyName() {
        User user = new User("1", "Jorge", "Muñoz", new ArrayList<>());
        assertEquals("Muñoz", user.getFamilyName());
    }

    @Test
    public void testSetFamilyName() {
        User user = new User("1", "Jorge", "Muñoz", new ArrayList<>());
        user.setFamilyName("Muñoz");
        assertEquals("Muñoz", user.getFamilyName());
    }

    @Test
    public void testGetFractions() {
        List<Fraction> fractions = Arrays.asList(new Fraction(1, 2), new Fraction(3, 4));
        User user = new User("1", "Jorge", "Muñoz", fractions);
        assertEquals(fractions, user.getFractions());
    }

    @Test
    public void testAddFraction() {
        User user = new User("1", "Jorge", "Muñoz", new ArrayList<>());
        Fraction fraction = new Fraction(1, 2);
        user.addFraction(fraction);
        assertEquals(1, user.getFractions().size());
        assertEquals(fraction, user.getFractions().get(0));
    }

    @Test
    public void testInitials() {
        User user = new User("1", "Jorge", "Muñoz", new ArrayList<>());
        assertEquals("J.", user.initials());
    }

    @Test
    public void testToString() {
        User user = new User("1", "Jorge", "Muñoz", Arrays.asList(new Fraction(1, 2), new Fraction(3, 4)));
        assertEquals("User{id='1', name='Jorge', familyName='Muñoz', fractions=[Fraction{numerator=1, denominator=2}, Fraction{numerator=3, denominator=4}]}", user.toString());
    }
    @Test
    public void testFullName() {
        User user = new User("1", "Jorge", "Muñoz", null);
        assertEquals("Jorge Muñoz", user.fullName());
    }

    @Test
    public void testSetFractions() {
        User user = new User("1", "Jorge", "Muñoz", new ArrayList<>());
        List<Fraction> fractions = Arrays.asList(new Fraction(1, 2), new Fraction(3, 4));
        user.setFractions(fractions);
        assertEquals(fractions, user.getFractions());
    }
}

