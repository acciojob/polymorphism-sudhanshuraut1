package com.driver;

public class Main {
    public static void main(String[] args) {
    Product p = new Product();
    int a = p.product(3,5);
    int b = p.product(2,4,6);

    double c = p.product(12.3,11.5);
    }
}

class Product{
    public int product(int x, int y) {
     return x+y;
    }
    public int product(int x, int y, int z) {
      return x+y+z;
    }
    public double product(double x, double y) {
          return x+y;
    }
}