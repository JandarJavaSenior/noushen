public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone("iphone 5",5000);
        System.out.println(phone.getName());
        System.out.println(phone.getPrice());
        phone.sound();
        phone.takePhoto();

    }
}