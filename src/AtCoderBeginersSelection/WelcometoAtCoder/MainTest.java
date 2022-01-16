package AtCoderBeginersSelection.WelcometoAtCoder;

import AtCoderBeginersSelection.WelcometoAtCoder.Main;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MainTest {
  Main main;
  @BeforeEach
  public void init() {
    this.main = new Main();
  }

  @Test
  public void Test1() {
    main.aa();
  }

}