package BaiTapJava4;

import java.util.ArrayList;

public class VongLapFORvaMANG {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i =0; i <= 50; i ++){
            if(i%2 == 0){
                System.out.println(i);
                arr.add(i);
            }
        }
        System.out.println("Các số chẵn từ 0 -> 50: ");
        for(int i : arr){
            System.out.println(i);
        }
    }
}
