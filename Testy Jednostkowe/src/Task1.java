import java.util.Scanner;

public class Task1 {

    public String Input(){
        System.out.println("Napisz swoje miasto, twoj wiek, dzien w ktorym kupujesz bilet");
        System.out.print("Podaj swoje dane: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input;
    }

    public User User(String input){
        String[] data = input.split("\\s+|,\\s*|,");
        String city = data[0];
        int age = Integer.parseInt(data[1]);
        String day = data[2];
        User user = new User(age,city,day);
        return user;
    }

    public int Discount(User user){
        int discount = 0;
        if(user.age < 10){
            discount += 100;
        }
        else if(user.age > 10 && user.age <= 18){
            discount += 50;
        }

        if(user.day.equals("Czwartek")){
            discount += 100;
        }

        if(user.city.equals("Warszawa")){
            discount += 10;
        }
        if(discount > 100){
            return 100;
        }
        else{
            return discount;
        }
    }

    public double Price(int discount, int pay_amount){
        return pay_amount - (double)pay_amount*discount/100;
    }

}
