public class Way {
    private String title;
    private int price;

    public Way(){
        this.title = null;
        this.price = 0;
    }

    public Way(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setTitlePrice(String title, int price) {
        this.title = title;
        this.price = price;
    }
}
