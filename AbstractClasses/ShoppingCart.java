package AbstractClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public abstract String getDescription();
}

class ElectronicsProduct extends Product {
    private String brand;
    private String model;

    public ElectronicsProduct(String name, double price, String brand, String model) {
        super(name, price);
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String getDescription() {
        return "Electronics Product: " + getName() + ", Brand: " + brand + ", Model: " + model + ", Price: $" + getPrice();
    }
}

class ClothingProduct extends Product {
    private String size;
    private String color;

    public ClothingProduct(String name, double price, String size, String color) {
        super(name, price);
        this.size = size;
        this.color = color;
    }

    @Override
    public String getDescription() {
        return "Clothing Product: " + getName() + ", Size: " + size + ", Color: " + color + ", Price: $" + getPrice();
    }
}

class BookProduct extends Product {
    private String author;
    private int pages;

    public BookProduct(String name, double price, String author, int pages) {
        super(name, price);
        this.author = author;
        this.pages = pages;
    }

    @Override
    public String getDescription() {
        return "Book Product: " + getName() + ", Author: " + author + ", Pages: " + pages + ", Price: $" + getPrice();
    }
}

public class ShoppingCart {
    private List<Product> products;

    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayProducts() {
        for (Product product : products) {
            System.out.println(product.getDescription());
        }
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        while (true) {
            System.out.println("Enter product type (electronics/clothing/book) or 'done' to finish: ");
            String type = scanner.nextLine();

            if (type.equalsIgnoreCase("done")) {
                break;
            }

            System.out.println("Enter product name: ");
            String name = scanner.nextLine();

            System.out.println("Enter product price: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // consume newline

            switch (type.toLowerCase()) {
                case "electronics":
                    System.out.println("Enter brand: ");
                    String brand = scanner.nextLine();
                    System.out.println("Enter model: ");
                    String model = scanner.nextLine();
                    cart.addProduct(new ElectronicsProduct(name, price, brand, model));
                    break;
                case "clothing":
                    System.out.println("Enter size: ");
                    String size = scanner.nextLine();
                    System.out.println("Enter color: ");
                    String color = scanner.nextLine();
                    cart.addProduct(new ClothingProduct(name, price, size, color));
                    break;
                case "book":
                    System.out.println("Enter author: ");
                    String author = scanner.nextLine();
                    System.out.println("Enter number of pages: ");
                    int pages = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    cart.addProduct(new BookProduct(name, price, author, pages));
                    break;
                default:
                    System.out.println("Invalid product type");
                    break;
            }
        }

        scanner.close();

        System.out.println("\nProducts in your cart:");
        cart.displayProducts();
        System.out.println("Total Price: " + cart.calculateTotalPrice());
    }
}

