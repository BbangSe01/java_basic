package access.ex;

public class Item {
    private String menu;
    private int price;
    private int count;

    public Item(String menu,int price,int count) {
        this.menu = menu;
        this.price = price;
        this.count = count;
    }

    public String getMenu() {
        return menu;
    }

    public int getTotalPrice() {
        return price*count;
    }
}
