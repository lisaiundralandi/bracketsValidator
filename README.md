# BracketsValidator

Walidator poprawności nawiasów. 
Sprawdza, czy nawiasy są poprawnie zamknięte w tekście.

## Użycie

Aby sprawdzić tekst, należy użyć metody `validate(String)` z klasy `BracketsValidator`.

Obsługiwane nawiasy to:
* `()`
* `[]`
* `{}`

Przykład użycia:
```java
boolean result = bracketsValidator.validate("()()()[{}]{}");
assertTrue(result);
```

Program potrafi także sprawdzać poprawność nawiasów w plikach.
Do tego służy klasa `Main`. Po uruchomieniu program odczyta 
w pierwszej kolejności plik `inventory.txt` z folderu `brackets`.
W tym pliku powinny znajdować się nazwy plików do sprawdzenia.
Przykład znajduje się w folderze [`brackets`](brackets/inventory.txt).

## Scenariusze Cucumber
Scenariusze znajdują się w folderze [src/test/resources/scenarios](src/test/resources/scenarios).