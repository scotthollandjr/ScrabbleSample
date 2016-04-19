import org.junit.*;
import static org.junit.Assert.*;
// import java.util.ArrayList;

public class ScrabbleTest {

  @Test
  public void calculate_returnScoreForSingleLetter_1() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 5;
    assertEquals(expected, testScrabble.scrabbleScore("K"));
    // assertEquals(1, testScrabble.scrabbleScore("a"));
    // assertEquals(10, testScrabble.scrabbleScore("x"));
  }

}
