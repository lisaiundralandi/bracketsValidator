package io.github.lisaiundralandi.brackets;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BracketsValidatorTest {
    private final BracketsValidator bracketsValidator = new BracketsValidator();

    @Test
    void correctInput() {
        boolean result = bracketsValidator.validate("()()()[{}]{}");
        assertTrue(result);
    }

    @Test
    void incorrectInput() {
        boolean result = bracketsValidator.validate("([)]");
        assertFalse(result);
    }

    @Test
    void emptyInput() {
        boolean result = bracketsValidator.validate(" ");
        assertTrue(result);
    }

    @Test
    void closingBracketOnly() {
        boolean result = bracketsValidator.validate(")");
        assertFalse(result);
    }

}