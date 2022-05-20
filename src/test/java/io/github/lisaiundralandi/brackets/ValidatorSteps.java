package io.github.lisaiundralandi.brackets;

import io.cucumber.java.pl.Kiedy;
import io.cucumber.java.pl.Wtedy;
import org.junit.jupiter.api.Assertions;

public class ValidatorSteps {
    private BracketsValidator bracketsValidator = new BracketsValidator();
    private boolean result;

    @Kiedy("poddaję walidacji {string}")
    public void poddaję_walidacji(String input) {
        result = bracketsValidator.validate(input);
    }

    @Wtedy("walidator stwierdzi poprawność nawiasów")
    public void walidator_stwierdzi_poprawność_nawiasów() {
        Assertions.assertTrue(result);
    }

    @Wtedy("walidator stwierdzi, że nawiasy są niepoprawnie zamknięte")
    public void walidator_stwierdzi_że_nawiasy_są_niepoprawnie_zamknięte() {
        Assertions.assertFalse(result);
    }

}
