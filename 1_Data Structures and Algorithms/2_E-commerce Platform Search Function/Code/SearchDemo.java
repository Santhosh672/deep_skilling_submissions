package ecommerce;

import java.util.Arrays;
import java.util.Comparator;

public class SearchDemo {

    public static void main(String[] args) {
        Product[] inventory = {
            new Product(1, "Keyboard", "Electronics"),
            new Product(2, "Shoes", "Footwear"),
            new Product(3, "Monitor", "Electronics"),
            new Product(4, "Shirt", "Apparel")
        };

        Product matchLinear = linearSearch(inventory, "Monitor");
        System.out.println("Linear Search Result: " + matchLinear);

        Arrays.sort(inventory, Comparator.comparing(p -> p.productName.toLowerCase()));  

        Product matchBinary = binarySearch(inventory, "Monitor");
        System.out.println("Binary Search Result: " + matchBinary);
    }

    public static Product linearSearch(Product[] list, String target) {
        for (int i = 0; i < list.length; i++) {
            Product p = list[i];
            if (p.productName.equalsIgnoreCase(target)) {
                return p;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] sortedItems, String targetName) {
        int low = 0;
        int high = sortedItems.length - 1;
        String target = targetName.toLowerCase();

        while (low <= high) {
            int middle = (low + high) / 2;
            Product current = sortedItems[middle];
            String currentName = current.productName.toLowerCase();

            int check = currentName.compareTo(target);

            if (check == 0) {
                return current;
            } else if (check < 0) {
                low = middle + 1; 
            } else {
                high = middle - 1; 
            }

        }

        return null;
    }
}

