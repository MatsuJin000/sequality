package org.example;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public double average(int x, int y) {
    return (double) sum(x, y) / 2;
  }

  public int totalSum(int x, int y) {
    int tsum = 0;
    for (int i = x; i <= y; i++) {
      tsum += i;
    }
    return tsum;
  }

  public int oddSum(int x, int y) {
    int osum = 0;
    for (int i = x; i <= y; i++) {
      if (i % 2 == 1) {
        osum += i;
      }
    }
    return osum;
  }

  public int evenSum(int x, int y) {
    return totalSum(x, y) - oddSum(x, y);
  }

  // public static void main(String args[]) {
  // int x = 2;
  // int y = 3;
  // Calculate calc = new Calculate();
  // System.out.print(calc.totalSum(x, y));
  // System.out.print(calc.oddSum(x, y));
  // System.out.print(calc.evenSum(x, y));
  // }

}
