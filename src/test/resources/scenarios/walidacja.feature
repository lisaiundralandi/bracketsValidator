#language: pl
Funkcja:

  Szablon scenariusza: Poprawne nawiasy
    Kiedy poddaję walidacji <dane>
    Wtedy walidator stwierdzi poprawność nawiasów
    Przykłady:
      | dane           |
      | "()()()[{}]{}" |
      | "(({{[]}}))"   |
      | " "            |

  Szablon scenariusza: Niepoprawne nawiasy
    Kiedy poddaję walidacji <dane>
    Wtedy walidator stwierdzi, że nawiasy są niepoprawnie zamknięte
    Przykłady:
      | dane   |
      | "([)]" |
      | ")"    |
