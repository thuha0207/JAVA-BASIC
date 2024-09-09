package BaiTapJava5;

import java.util.ArrayList;

public class Add_Employees {
    public static void main(String[] args) {
        ArrayList<String> Infor = new ArrayList<>();

        Infor.add("Họ tên: NGUYỄN THỊ THU HÀ");
        Infor.add("Id: 13256");
        Infor.add("Chức vụ: Nhân viên kiểm thử");
        Infor.add("Level: Fresher");
        Infor.add("Năm sinh: 2000");
        Infor.add("Quê quán: Bắc Ninh");

        System.out.println();
        for(int i = 0; i < Infor.size(); i++){
            System.out.println(Infor.get(i));
        }
    }
}
