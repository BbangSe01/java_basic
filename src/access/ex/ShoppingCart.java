package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;
    public void addItem (Item item) {
        items[itemCount] = item;
        itemCount++;
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");

        for(int i=0;i<itemCount;i++) {
            System.out.println("상품명:"+items[i].getMenu()+", 합계:"+items[i].getTotalPrice());
        }
        System.out.println("전체 가격 합: "+calculateTotalPrice());
    }

    private int calculateTotalPrice () {
        int total = 0;
        for(int i=0;i<itemCount;i++) {
            total+=items[i].getTotalPrice();
        }
        return total;
    }
}
