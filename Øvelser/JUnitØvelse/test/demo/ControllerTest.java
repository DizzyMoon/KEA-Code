package demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ControllerTest {

  @Test
  void addToNameListTest(){
    //arrange
    Controller controller = new Controller();
    //act
    controller.addToNameList("Preben");
    String name1 = controller.getNameList().get(0);
    controller.addToNameList("Tobias");
    String name2 = controller.getNameList().get(1);
    //assert
    assertEquals(name1, "Preben");
    assertEquals(name2, "Tobias");
  }

  @Test
  void throwDiceTest(){
    //arrange
    Controller controller = new Controller();
    //act
    int actual = controller.throwDice();
    //assert
    assertTrue(actual > 0 && actual <= 6);
  }
}
