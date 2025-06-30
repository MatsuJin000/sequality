package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  @Test
  public void testAve_5and9() {
    Calculate calc = new Calculate();
    double expected = 7;
    assertEquals(expected, calc.average(5, 9), 0.01);
  }

  @Test
  public void testTotalSum_3to6() {
    Calculate calc = new Calculate();
    int expected = 18;
    assertEquals(expected, calc.totalSum(3, 6));
  }

  @Test
  public void testTotalSum_6to3() {
    Calculate calc = new Calculate();
    int expected = 0;
    assertEquals(expected, calc.totalSum(6, 3));
  }

  @Test
  public void testOddSum_1to10() {
    Calculate calc = new Calculate();
    int expected = 25;
    assertEquals(expected, calc.oddSum(1, 10));
  }

  @Test
  public void testOddSum_10to1() {
    Calculate calc = new Calculate();
    int expected = 0;
    assertEquals(expected, calc.oddSum(10, 1));
  }

  @Test
  public void testEvenSum_1to10() {
    Calculate calc = new Calculate();
    int expected = 30;
    assertEquals(expected, calc.evenSum(1, 10));
  }

  @Test
  public void testEvenSum_10to1() {
    Calculate calc = new Calculate();
    int expected = 0;
    assertEquals(expected, calc.evenSum(10, 1));
  }
}
