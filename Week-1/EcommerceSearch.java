import java.util.Scanner;

class Product {
    int productId;
    String productName;
    String category;

    Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
}

public class EcommerceSearch {

    public static Product binarySearch(Product[] products, int targetId) {

        int low = 0;
        int high = products.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (products[mid].productId == targetId)
                return products[mid];

            if (products[mid].productId < targetId)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return null;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Mobile", "Electronics"),
            new Product(103, "Headphones", "Accessories"),
            new Product(104, "Smart Watch", "Wearables"),
            new Product(105, "Keyboard", "Accessories")
        };

        System.out.print("Enter Product ID to Search: ");
        int searchId = sc.nextInt();

        Product result = binarySearch(products, searchId);

        if (result != null) {
            System.out.println("\nProduct Found");
            System.out.println("ID: " + result.productId);
            System.out.println("Name: " + result.productName);
            System.out.println("Category: " + result.category);
        } else {
            System.out.println("Product Not Found");
        }

        sc.close();
    }
}