package AtCoderBeginersSelection.ABC087B;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
  @Test
  public void Test1() {
    assertEquals(2, Main.cloc(2,2,2,100));
  }

  @Test
  public void Test2() {
    assertEquals(0, Main.cloc(5,1,0,150));
  }

  @Test
  public void Test3() {
    assertEquals(213, Main.cloc(30,40,50,6000));
  }

}