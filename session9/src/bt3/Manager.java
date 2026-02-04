public class Manager extends Employee {
    private String phongBan;

    public Manager(String ten, double luongCoBan, String phongBan) {
        super(ten, luongCoBan);
        this.phongBan = phongBan;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Phòng ban: " + phongBan);
    }
}
