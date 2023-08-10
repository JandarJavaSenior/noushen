public class Phone extends Device{
    private  int price;

    public Phone(String name, int price) {
        super(name);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void sound() {
        super.sound();
    }
    public void takePhoto(){
        System.out.println("chik chik");
    }
}