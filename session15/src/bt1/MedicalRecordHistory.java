package bt1;

import java.util.Stack;

public class MedicalRecordHistory {

    private Stack<EditAction> history;

    // Constructor
    public MedicalRecordHistory() {
        history = new Stack<>();
    }

    // Thêm chỉnh sửa (push)
    public void addEdit(EditAction action) {
        history.push(action);
        System.out.println("Đã thêm chỉnh sửa: " + action);
    }

    // Hoàn tác chỉnh sửa gần nhất (pop)
    public EditAction undoEdit() {
        if (history.isEmpty()) {
            System.out.println("Không có chỉnh sửa nào để undo.");
            return null;
        }
        EditAction removed = history.pop();
        System.out.println("Đã undo: " + removed);
        return removed;
    }

    // Xem chỉnh sửa gần nhất (peek)
    public EditAction getLatestEdit() {
        if (history.isEmpty()) {
            System.out.println("Stack đang rỗng.");
            return null;
        }
        return history.peek();
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }

    // Hiển thị toàn bộ lịch sử
    public void displayHistory() {
        if (history.isEmpty()) {
            System.out.println("Lịch sử chỉnh sửa trống.");
            return;
        }

        System.out.println("=== LỊCH SỬ CHỈNH SỬA (Từ mới → cũ) ===");
        for (int i = history.size() - 1; i >= 0; i--) {
            System.out.println(history.get(i));
        }
    }
}