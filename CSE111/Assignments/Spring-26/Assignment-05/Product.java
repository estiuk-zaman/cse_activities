public class Product {
    public static String[] prodName = new String[3];
    public static int[] prodQny = new int[3];
    public static int count;

    public Product(String name, int qty) {
        if (count < 3) {
            prodName[count] = name;
            prodQny[count] = qty;
            count++;
            System.out.println("Stored: " + name); 
        } else {
            System.out.println("Storage is full! Cannot add " + name);
        }
    }

    public static void buy(String Wantname, int Wantqty) {
        boolean isFound = false;
        for (int i = 0; i < count; i++) {
            if (Wantname.equalsIgnoreCase(prodName[i])) {
                isFound = true;
                if (prodQny[i] >= Wantqty) {
                    System.out.println("Product Sold");
                    prodQny[i] -= Wantqty;
                } else {
                    System.out.println("Quantity low");
                }
                break;
            }
        }
        if (!isFound) {
            System.out.println("Product not found");
        }
    }

    public static void displayProducts() {
        System.out.println("=== Stored Products ===");
        for (int i = 0; i < count; i++) {
            System.out.println(prodName[i] + " - Qty: " + prodQny[i]);
        }
    }
}