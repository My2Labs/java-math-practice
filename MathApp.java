public class MathApp {
  public static void main(String[] args) {
    int job1Salary = 40000;
    int job2Salary = 70000;
    int carPrice = 30000;
    int truckPrice = 48000;
    int circleRadius = 725;
    float findArea = 100;
    float num1 = 5;
    int x1 = 5;
    int x2 = 10;
    int y1 = 85;
    int y2 = 50;
    double dis;
    dis = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    double num2 = -3.8;
    double rand = Math.random() * 1;

    System.out
        .println("Highest Paying Salary: " + Math.max(job1Salary, job2Salary));
    System.out.println("Lowest Vehicle Cost: " + Math.min(carPrice, truckPrice));
    System.out.println("Area of Circle: " + circleRadius / findArea);
    System.out.println("Square root of number: " + Math.sqrt(num1));
    System.out.println("Distance between: " + dis);
    System.out.println("Absolute Value: " + Math.abs(num2));
    System.out.println("Random Number Between 0 and 1: " + rand);
  }
}
