import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Product{
    static int id = 1;
    private String name, category;
    private final int prod_id;
    Product(String name, String category) {
        this.name = name;
        this.prod_id = id++;
        this.category = category;
    }

    public int getProdId() {
        return prod_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "category='" + category + '\'' +
                ", name='" + name + '\'' +
                ", prod_id=" + prod_id +
                '}';
    }
}

public class Q1 {
    public static void main(String[] args) {
        ArrayList<Product> prods = new ArrayList<Product>();
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("-----------------------PIS welcomes you---------------------");
            System.out.println("1. Add a new product");
            System.out.println("1. Update product's category");
            System.out.println("1. Remove a product");
            System.out.println("1. Display all products");
            int x = sc.nextInt();
            switch (x){
                case 1: {
                    System.out.println("Enter name of product:");
                    String name = sc.next();
                    System.out.println("Enter category of the product");
                    String category = sc.next();
                    prods.add(new Product(name, category));
                    System.out.println("Product added successfully");
                } break;
                case 2: {
                    System.out.println("Enter id of product you want to update the category:");
                    int id = sc.nextInt();
                    boolean flag = false;
                    for (Product p: prods) {
                        if (p.getProdId() == id) {
                            System.out.println("Product with the entered id found. Enter new category:");
                            String cat = sc.nextLine();
                            p.setCategory(cat);
                            flag = true;
                            System.out.println("Category of product changed successfully");
                            break;
                        }
                    }
                    if (!flag) {
                        System.out.println("Enter product id does\'nt exist");
                    }
                } break;
                case 3: {
                    System.out.println("Enter id of product you want to remove:");
                    int id = sc.nextInt();
                    boolean flag = false;
                    for (Product p: prods) {
                        if (p.getProdId() == id) {
                            flag = true;
                            prods.remove(p);
                            System.out.println("Product removed successfully");
                            break;
                        }
                    }
                    if (!flag) {
                        System.out.println("Enter product id does\'nt exist");
                    }
                } break;
                case 4: {
                    for(Product p: prods) {
                        System.out.println(p);
                    }
                } break;
                case 5: {
                    System.out.println("Thank you for using PIS. Bye bye...");
                    break;
                }
                default : {
                    System.out.println("Wrong choice selected");
                }
            }
        }
    }
}
