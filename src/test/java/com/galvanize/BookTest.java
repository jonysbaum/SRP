package com.galvanize;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BookTest {

    @Test
    public void bookFormattedNameReturnsCorrectly() {
        Book book = new Book();
        book.setFirstName("Eric");
        book.setLastName("Evans");
        book.setTitle("Domain-Driven Design");
        book.setYear(2004);
        book.setName("Addison-Wesley");
        book.setCity("New York");

        String expected = "Domain-Driven Design (2004)\n" +
                "Written by Evans, Eric\n" +
                "Published by Addison-Wesley, New York";

        assertEquals(expected, book.getFormattedName());
    }
}
