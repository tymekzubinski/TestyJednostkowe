public class Main {
    private static final int DEFAULT_PRICE = 40;

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        String input = task1.Input();
        User user = task1.User(input);
        int discount = task1.Discount(user);
        double price = task1.Price(discount, DEFAULT_PRICE);

        System.out.print("Dane: ");
        System.out.print(user.city + ", ");
        System.out.print(user.age + " lat, ");
        System.out.println(user.day);
        System.out.println("Cena biletu: " + price + " zł");
        System.out.println("Znizka: " + discount + "%");
    }

}