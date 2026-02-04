public class ProductionEmployee extends Employee {
    private int soSanPham;
    private double tienCongMoiSanPham;

    public ProductionEmployee(String ten, int soSanPham, double tienCongMoiSanPham) {
        super(ten);
        this.soSanPham = soSanPham;
        this.tienCongMoiSanPham = tienCongMoiSanPham;
    }

    @Override
    public double calculateSalary() {
        return soSanPham * tienCongMoiSanPham;
    }
}
