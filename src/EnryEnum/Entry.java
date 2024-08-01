package EnryEnum;

public enum Entry {
    MENU(1,"MENU"),
    EXIT(2,"EXIT");
    private int order;
    private String menu;

    Entry(int order, String menu) {
        this.menu=menu;
        this.order=order;

    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }
}
