package BaiTapJava1;

public class SinhVien {
    String Ten_Truong = "Đại học Công Thương";
    public static int MSSV = 12345678;
    public void Khoa(){
        String khoa =  "Công Nghệ Thông Tin";
        System.out.println("Trường:"+Ten_Truong);
        System.out.println("Khoa đang theo học : "+khoa);
    }

    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        ThongTin thongtin = new ThongTin();
        System.out.println("Họ tên sinh viên: "+thongtin.hoten_SV);
        System.out.println("Năm sinh: "+thongtin.namsinh);
        sv.Khoa();
        System.out.println("Chuyên ngành: "+thongtin.nganh);
        System.out.println("Mã số sinh viên : "+MSSV);
        System.out.println("Điểm trung bình : "+thongtin.DTB);
        System.out.println("Trạng thái: "+thongtin.trangthai);
        System.out.println("Năm nhập học: "+thongtin.namnhaphoc);
        System.out.println("Năm tốt nghiệp: "+thongtin.namtotnghiep);
    }
}