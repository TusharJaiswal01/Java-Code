iimport java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javs.util.Map;
// Class representing a product  and other testings are done
class Product {
    private String id;
    private String name;
    private double price;

    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;//pricee//ram
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
//here js code for that logic

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{id='" + id + "', name='" + name + "', price=" + price + "}";
    }
}

// Class representing an order
class Order {
    private static int orderCount = 0;
    private int orderId;
    // this is private order id
    private Customer customer;
    private List<Product> products;
    private double total;

    public Order(Customer customer) {
        this.orderId = ++orderCount;
        this.customer = customer;
        this.products = new ArrayList<>();
        this.total = 0.0;
    }

    public void addProduct(Product product) {
        products.add(product);
        total += product.getPrice();
    }

    public int getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Order{orderId=" + orderId + ", customer=" + customer.getName() + ", products=" + products + ", total=" + total + "}";
    }
}

// Class representing a customer
class Customer {
    private String id;
    private String name;
    private String email;

    public Customer(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Customer{id='" + id + "', name='" + name + "', email='" + email + "}";
    }
}

// Class managing the e-commerce system
class ECommerceSystem {
    private Map<String, Product> products;
    private Map<String, Customer> customers;
    private List<Order> orders;

    public ECommerceSystem() {
        this.products = new HashMap<>();
        this.customers = new HashMap<>();
        this.orders = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.put(product.getId(), product);
    }

    public void addCustomer(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    public void placeOrder(String customerId, List<String> productIds) {
        Customer customer = customers.get(customerId);
        if (customer == null) {
            System.out.println("Customer not found");
            return;
        }

        Order order = new Order(customer);
        for (String productId : productIds) {
            Product product = products.get(productId);
            if (product != null) {
                order.addProduct(product);
            } else {
                System.out.println("Product with ID " + productId + " not found");
            }
        }
        orders.add(order);
        System.out.println("Order placed: " + order);
    }

    public void displayOrders() {
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}

// Main class to test the e-commerce system
public class Main {
    public static void main(String[] args) {
        ECommerceSystem system = new ECommerceSystem();

        // Adding product and rendrings
        Product prod1 = new Product("p1", "Laptop", 1000.00);
        Product prod2 = new Product("p2", "Smartphone", 500.00);
        system.addProduct(prod1);
        system.addProduct(prod2);

        // Adding customers
        Customer cust1 = new Customer("c1", "John Doe", "john@example.com");
        Customer cust2 = new Customer("c2", "Jane Smith", "jane@example.com");
        system.addCustomer(cust1);
        system.addCustomer(cust2);

        // Placing orders
        List<String> productIds = new ArrayList<>();
        productIds.add("p1");
        system.placeOrder("c1", productIds);

        productIds.clear();
        productIds.add("p2");
        system.placeOrder("c2", productIds);

        // Displaying orders
        system.displayOrders();
    }
}
