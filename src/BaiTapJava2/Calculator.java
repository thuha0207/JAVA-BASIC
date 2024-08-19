package BaiTapJava2;

public class Calculator {
    public int Tong2SoNguyen(int a, int b){
        int sum ;
        sum = a + b;
        System.out.println("Tổng 2 số nguyên: a + b = " +sum);
        return sum;
    }
    public double Tong2SoThuc(double c, double d){
        double sum;
        sum = c + d;
        System.out.println("Tổng 2 số thực: c + d = " + sum);
        return sum;
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.Tong2SoNguyen(25,28);
        calculator.Tong2SoThuc(25.3, 10.01);
    }
}
