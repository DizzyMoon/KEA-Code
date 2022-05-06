package demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

  @Test
  void sumPositive() {
    //arrange
    Calculator calc = new Calculator();
    //act
    int actual = calc.sum(1, 2);
    //assert
    int expected = 3;
    assertEquals(actual, expected);
  }

  @Test
  void sumNegative(){
    //arrange
    Calculator calc = new Calculator();
    //act
    int actual = calc.sum(-3, -4);
    //assert
    int expected = -8;
    assertEquals(actual, expected);
  }

  @Test
  void sumBigNum(){
    //arrange
    Calculator calc = new Calculator();
    //act + assert
    assertThrows(IllegalArgumentException.class, () -> {
    int actual = calc.sum(Integer.MAX_VALUE, Integer.MAX_VALUE);
    });
  }

  @Test
  void sumKindaBigNum(){
    //arrange
    Calculator calc = new Calculator();
    //act + assert
    assertThrows(IllegalArgumentException.class, () -> {
      int actual = calc.sum(101, 101);
    });
  }
}