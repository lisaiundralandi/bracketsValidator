package io.github.lisaiundralandi.brackets;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        List<String> files = Files.readAllLines(Path.of("brackets", "inventory.txt"));
        BracketsValidator bracketsValidator = new BracketsValidator();

        for (String file : files) {
            String fileContent = Files.readString(Path.of("brackets", file));
            System.out.println(file);

            boolean hasCorrectlyClosedBracets = bracketsValidator.validate(fileContent);

            if (hasCorrectlyClosedBracets) {
                System.out.println("Poprawnie zamknięte nawiasy");
            } else {
                System.out.println("Niepoprawnie zamknięte nawiasy");
            }
            System.out.println();
        }
    }
}
