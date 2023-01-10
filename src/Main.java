public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
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
    }}
    public static void task3() {
        System.out.println("Задача 3");
        int speed = 50;
        if ( speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф.");
        } else  {
            System.out.println( "Если скорость " + speed + " км/ч, то можно ездить спокойно.");
        }
        int speed2 = 70;
        if ( speed2 > 60) {
            System.out.println("Если скорость " + speed2 + " км/ч, то придется заплатить штраф.");
        } else  {
            System.out.println( "Если скорость " + speed2 + " км/ч, то можно ездить спокойно.");
        }}
    public static void task4() {
        System.out.println("Задача 4");
        int humanAge = 50;
        boolean needToGoToKindergarten = humanAge >= 2 && humanAge <=6;
        boolean needToGoToSchool = humanAge >=7 && humanAge <18;
        boolean needToGoToUniversity = humanAge >=18 && humanAge <24;
        boolean needToGoToWork = humanAge >=24;
        if (needToGoToKindergarten) {
            System.out.println("Если возраст человека равен " + humanAge + " лет, то ему нужно ходить в детский сад.");
        } else {
            if (needToGoToSchool) {
            System.out.println("Если возраст человека равен " + humanAge + " лет, то ему нужно ходить в школу.");
        } else {
                if (needToGoToUniversity) {
            System.out.println("Если возраст человека равен " + humanAge + " лет, nо ему нужно ходить в университет.");
        } else {
                    System.out.println("Если возраст человека больше " + humanAge + " лет, то ему нужно ходить на работу.");
                }
    }}}}
