/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package referencelibrary;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rimi
 */
public class ReferenceTest {

    Reference reference = null;

    public ReferenceTest() {
    }

    @Before
    public void setUp() {
        this.reference = new Reference("book", "my_book");
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testConstructor() {
        reference = new Reference("book", "my_book");
        assertEquals(reference.getReferenceName(), "my_book");
        assertEquals(reference.getReferenceType(), "book");
        assertTrue(reference.getFieldValues().isEmpty());
    }

    @Test
    public void testSetField() {
        String fieldName = "author";
        reference.setField(fieldName, "Risto Mikkola");
        assertEquals(reference.getField(fieldName), "Risto Mikkola");
        reference.setField(fieldName, "Jukka-Pekka Moilanen");
        assertEquals(reference.getField(fieldName), "Jukka-Pekka Moilanen");
    }

    @Test
    public void testGetField() {
        String fieldName = "author";
        assertNull(reference.getField(fieldName));
        reference.setField(fieldName, "Sami Sarsa");
        assertEquals(reference.getField(fieldName), "Sami Sarsa");
    }

}