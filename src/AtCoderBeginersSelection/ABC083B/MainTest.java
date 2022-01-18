package AtCoderBeginersSelection.ABC083B;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
  @Test
  public void Test1() {
    assertEquals(84, Main.cloc(20, 2, 5));
  }

  @Test
  public void Test2() {
    assertEquals(13, Main.cloc(10, 1, 2));
  }

  @Test
  public void Test3() {
    assertEquals(4554, Main.cloc(100, 4, 16));
  }
}