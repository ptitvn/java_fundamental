public class StudentManager {
    private Student[] students;
    private int count;

    public StudentManager(int size) {
        students = new Student[size];
        count = 0;
    }

    public boolean themSinhVien(Student s) {
        if (count == students.length) return false;

        for (int i = 0; i < count; i++) {
            if (students[i].getMaSV().equalsIgnoreCase(s.getMaSV()))
                return false;
        }

        students[count++] = s;
        return true;
    }

    public void hienThiDanhSach() {
        if (count == 0) {
            System.out.println("Danh sách trống.");
            return;
        }

        System.out.printf("%-10s %-20s %-5s %-8s %-6s %-10s%n",
                "Mã SV", "Họ tên", "Tuổi", "GT", "ĐTB", "Xếp loại");

        for (int i = 0; i < count; i++) {
            students[i].hienThi();
        }
    }

    public Student timTheoMa(String ma) {
        for (int i = 0; i < count; i++) {
            if (students[i].getMaSV().equalsIgnoreCase(ma))
                return students[i];
        }
        return null;
    }

    public boolean xoaSinhVien(String ma) {
        for (int i = 0; i < count; i++) {
            if (students[i].getMaSV().equalsIgnoreCase(ma)) {
                for (int j = i; j < count - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[--count] = null;
                return true;
            }
        }
        return false;
    }

    public void sapXepTheoDiem() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (students[j].getDiemTB() < students[j + 1].getDiemTB()) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }

    public void thongKe() {
        int gioi = 0, kha = 0, tb = 0, yeu = 0;

        for (int i = 0; i < count; i++) {
            switch (students[i].getXepLoai()) {
                case "Giỏi": gioi++; break;
                case "Khá": kha++; break;
                case "Trung bình": tb++; break;
                default: yeu++;
            }
        }

        System.out.println("Giỏi: " + gioi);
        System.out.println("Khá: " + kha);
        System.out.println("Trung bình: " + tb);
        System.out.println("Yếu: " + yeu);
    }
}
