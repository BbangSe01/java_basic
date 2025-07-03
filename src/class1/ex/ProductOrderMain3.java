package class1.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        ProductOrder[] orderList = new ProductOrder[3];
        for(int i=0; i<orderList.length;i++) {
            System.out.println((i+1)+"번째 주문 정보를 입력하세요.");
            System.out.print("상품명: ");
            String productName = scanner.nextLine();
            System.out.print("가격: ");
            int price = scanner.nextInt();
            System.out.print("수량: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();
            orderList[i] = createOrder(productName,price,quantity);
        }
        printOrders(orderList);
        int total = getTotalAmount(orderList);
        System.out.println("총 결재 금액: "+total);
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder po = new ProductOrder();
        po.productName = productName;
        po.price = price;
        po.quantity = quantity;

        return po;
    }

    static void printOrders(ProductOrder[] orderList) {
        for(ProductOrder eachOrder:orderList) {
            System.out.println("상품명: "+eachOrder.productName+", 가격: "+eachOrder.price+", 수량: "+eachOrder.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orderList) {
        int total = 0;
        for(int i=0;i< orderList.length;i++) {
            total+=orderList[i].price*orderList[i].quantity;
        }
        return total;
    }
}
