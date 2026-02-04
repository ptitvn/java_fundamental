public class Student extends Person {
    private String maSinhVien;
    private double diemTrungBinh;

    public Student(String hoTen, int tuoi, String maSinhVien, double diemTrungBinh) {
        super(hoTen, tuoi);
        this.maSinhVien = maSinhVien;
        this.diemTrungBinh = diemTrungBinh;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Mã sinh viên: " + maSinhVien);
        System.out.println("Điểm trung bình: " + diemTrungBinh);
    }
}
