import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {
    Task1 task1 = new Task1();
    @Test
    void Price_Test_1(){
        int discount = 10;
        int pay_amount = 100;
        double res = task1.Price(discount, pay_amount);
        double prediction = 90;
        assertEquals(res, prediction);
    }
    @Test
    void Price_Test_2(){
        int discount = 5;
        int pay_amount = 754;
        double res = task1.Price(discount, pay_amount);
        double prediction = 716.3;
        assertEquals(res, prediction);
    }

    @Test
    void Discount_Test_1(){
        int age = 12;
        String city = "Warszawa";
        String day = "Poniedziałek";
        User user = new User(age, city, day);

        int res = task1.Discount(user);
        int prediction = 60;
        assertEquals(res, prediction);
    }
    @Test
    void Discount_Test_2() {
        int age = 40;
        String city = "Poznan";
        String day = "Czwartek";
        User user = new User(age, city, day);

        int res = task1.Discount(user);
        int prediction = 100;
        assertEquals(res, prediction);
    }
    @Test
    void Discount_Test_3() {
        int age = 7;
        String city = "Poznan";
        String day = "Czwartek";
        User user = new User(age, city, day);

        int res = task1.Discount(user);
        int prediction = 100;
        assertEquals(res, prediction);
    }

    @Test
    void User_Test_1(){
        String input = "Warsaw 15 Poniedziałek";
        User prediction = new User(15, "Warsaw", "Poniedziałek");
        User res = task1.User(input);

        assertEquals(prediction.age, res.age);
        assertEquals(prediction.city, res.city);
        assertEquals(prediction.day, res.day);
    }
}

