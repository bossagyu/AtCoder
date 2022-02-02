package ABC236.E;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

  @Test
  public void Test1(){
    int[] nums = {2, 1, 2, 1, 1, 10};
    Main.bitSearch(nums);
  }

  @Test
  public void Test2(){
    int[] nums = {3, 1, 4, 1, 5, 9, 2};
    Main.bitSearch(nums);
  }

}