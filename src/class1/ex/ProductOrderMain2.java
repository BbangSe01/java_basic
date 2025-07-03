package class1.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder dubu = createOrder("두부",2000,2);
        ProductOrder kimchi = createOrder("김치", 5000,1);
        ProductOrder cola = createOrder("콜라",1500,2);

        ProductOrder[] orderList = {dubu,kimchi,cola};
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
