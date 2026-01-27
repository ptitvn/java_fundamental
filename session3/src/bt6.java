import java.util.Arrays;

public class bt6 {

    public static int[] mergeBooks(int[] a, int[] b) {
        int[] temp = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                temp[k++] = a[i++];
            } else if (a[i] > b[j]) {
                temp[k++] = b[j++];
            } else {
                temp[k++] = a[i];
                i++;
                j++;
            }
        }

        while (i < a.length) {
            temp[k++] = a[i++];
        }

        while (j < b.length) {
            temp[k++] = b[j++];
        }

        int[] result = new int[k];
        result[0] = temp[0];
        int size = 1;

        for (int x = 1; x < k; x++) {
            if (temp[x] != result[size - 1]) {
                result[size++] = temp[x];
            }
        }

        return Arrays.copyOf(result, size);
    }

    public static void main(String[] args) {

        int[] arrayFirst = {1, 3, 5, 7, 9};
        int[] arraySecond = {2, 3, 5, 6, 8, 9, 10};

        System.out.println("Kho cũ: " + Arrays.toString(arrayFirst));
        System.out.println("Lô mới: " + Arrays.toString(arraySecond));

        int[] merged = mergeBooks(arrayFirst, arraySecond);

        System.out.println("Kho tổng (đã gộp & lọc trùng): " + Arrays.toString(merged));
    }
}
