package BaiTapJava3;

public class ToanTu {
    public void Ontap(){
        int a = 10;
        int b = 20;
        int c = 30;
        System.out.println("Giá trị của a: " + a);
        System.out.println("Giá trị của b: " + b);
        System.out.println("Giá trị của c: " + c);

        System.out.println("a > b: " + (a > b)); // a có lớn hơn b không?
        System.out.println("a < c: " + (a < c)); // a có nhỏ hơn c không?
        System.out.println("b == c: " + (b == c)); // b có bằng c không?

        System.out.println("(a < b) && (b < c): " + ((a < b) && (b < c))); // a nhỏ hơn b và b nhỏ hơn c?
        System.out.println("(a > b) || (b < c): " + ((a > b) || (b < c))); // a lớn hơn b hoặc b nhỏ hơn c?

        int sum = a + b + c;
        System.out.println(" a + b + c= " + sum);

        int product = a * b * c;
        System.out.println("a * b * c= " + product);

        int max = Math.max(a, Math.max(b, c));
        System.out.println("Giá trị lớn nhất trong a, b, c: " + max);
    }

    public void BaiTap3(int n) {
        int number = 100;
        if (n == number) {
            System.out.println("n bằng với number.");
        } else if (n < number) {
            System.out.println("n nhỏ hơn number.");
        } else if (n > number) {
            System.out.println("n lớn hơn number.");
        }
    }
    public static void main(String[] args) {
        ToanTu bt3 = new ToanTu();
        bt3.Ontap();
        ToanTu sosanh = new ToanTu();
        sosanh.BaiTap3(15);
        sosanh.BaiTap3(1020);
        sosanh.BaiTap3(100);
        sosanh.BaiTap3(0);
    }

}
