public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int humanAge = 5;
        if (humanAge >= 18) {
            System.out.println("Если возраст человека равен " + humanAge + " лет, то он совершеннолетний.");
        }
        if (humanAge < 18) {
            System.out.println("Если возраст человека равен " + humanAge + " лет, то он не достиг совершеннолетия, нужно немного подождать.");
        }
        int humanAge2 = 50;
        if (humanAge2 >= 18) {
            System.out.println("Если возраст человека равен " + humanAge2 + " лет, то он совершеннолетний.");
        }
        if (humanAge2 < 18) {
            System.out.println("Если возраст человека равен " + humanAge2 + " лет, то он не достиг совершеннолетия, нужно немного подождать.");
        }
    }
public static void task2(){
    System.out.println("Задача 2");
    int airTemperature = 10;
    if (airTemperature <5)
    {
        System.out.println("На улице холодн, нужно надеть шапку.");
    } else {
        System.out.println("Сегодня тепло, можно идти без шапки.");
    }

}}