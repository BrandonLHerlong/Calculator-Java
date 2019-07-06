public class Calculator {
  
  public Calculator() {
    
  }
  
  public double add(double a, double b) {
   double sum = a + b;
    return sum;
  }
  public double subtract(double a, double b) {
    double difference = a - b;
    return difference;
  }
  public double multiply(double a, double b) {
    double product = a * b;
    return product;
  }
  public double divide(double a, double b) {
    double quotient = a / b;
    return quotient;
  }
  public double modulo(double a, double b) {
    double remainder = a % b;
    return remainder;
  }
  
  public static void main(String[] args) {
    
    Calculator myCalculator = new Calculator();
    System.out.println(myCalculator.add(5, 7));
    System.out.println(myCalculator.subtract(45, 11));
    
  }
  
}