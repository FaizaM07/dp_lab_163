public class Main {
    public static void main(String[] args) {

        IProduct laptop = new Laptop("Dell Inspiron 15", "High performance laptop",  100000);
        IProduct phone = new Phone("Samsung Galaxy S24", "Latest Smartphone", 175000);


        Bundle techBundle = new TechBundle("Tech Bundle", "Laptop and Phone bundle", 0.10);
        techBundle.addProduct(laptop);
        techBundle.addProduct(phone);


        Bundle holidayBundle = new TechBundle("Holiday Bundle", "Gift", 0.15);
        holidayBundle.addProduct(techBundle);
        holidayBundle.addProduct(new Phone("iPhone 16", "Apple smartphone", 150000));


        holidayBundle.display();
    }
}
