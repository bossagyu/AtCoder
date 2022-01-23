package AtCoderBeginersSelection.ABC049C;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
  Main main;

  @BeforeEach
  public void init() {
    this.main = new Main();
  }

  @Test
  public void Test1(){
    main.message = "dreamerkohei";
    assertEquals(false, main.check());
    System.out.println(main.message);
  }

  @Test
  public void Test2(){
    main.message = "koheidreamer";
    assertEquals(true, main.check());
    System.out.println(main.message);
  }

  @Test
  public void Test3(){
    main.message = "dreamkohei";
    assertEquals(false, main.check());
    System.out.println(main.message);
  }

  @Test
  public void Test4(){
    main.message = "dream";
    assertEquals(true, main.check());
    System.out.println(main.message);
  }
}