import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1500));
        products.add(new Product("Chuột", 200));
        products.add(new Product("Bàn phím", 500));
        products.add(new Product("Màn hình", 3000));

       

        Collections.sort(products, new Comparator<Product>() {

        
            @Override
            public int compare(Product p1, Product p2) {
                return Double.compare(p1.getPrice(), p2.getPrice());
            }
        });

        System.out.println("Danh sách sản phẩm theo giá tăng dần:");
        for (Product p : products) {
            p.display();
        }

    

        Collections.sort(products,
                (p1, p2) -> p1.getName().compareToIgnoreCase(p2.getName())
        );

        System.out.println("\nDanh sách sản phẩm theo tên A-Z:");
        for (Product p : products) {
            p.display();
        }
    }
}
