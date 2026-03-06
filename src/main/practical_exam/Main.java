package main.practical_exam;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Product p = new Product();

        // Nhập thông tin sản phẩm
        System.out.print("Enter product id: ");
        p.setId(sc.nextInt());
        sc.nextLine();

        System.out.print("Enter product name: ");
        p.setName(sc.nextLine());

        System.out.print("Enter thumbnail: ");
        p.setThumbnail(sc.nextLine());

        System.out.print("Enter price: ");
        p.setPrice(sc.nextDouble());

        System.out.print("Enter quantity: ");
        p.setQty(sc.nextInt());
        sc.nextLine();

        System.out.print("Enter description: ");
        p.setDescription(sc.nextLine());

        // display the product details.
        System.out.println("\nProduct information:");
        p.displayInfo();

        // enter a desired order quantity,
        System.out.print("\nEnter order quantity: ");
        int orderQty = sc.nextInt();

        // check product availability, and place an order if
        //sufficient quantity is available.
        if(p.checkAvailability(orderQty)){
            double total = p.placeOrder(orderQty);
            System.out.println("Order successful!");
            System.out.println("Total price: " + total);
            System.out.println("Remaining quantity: " + p.getQty());
        }else{
            System.out.println("Not enough quantity in stock!");
        }

        sc.close();

    }
}
