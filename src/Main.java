import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Завдання 1

        Scanner x = new Scanner(System.in);
        String one, two, three, four, five, end;
        System.out.println("Введіть слово:");
        one = x.nextLine();
        System.out.println("Введіть слово:");
        two = x.nextLine();
        System.out.println("Введіть слово:");
        three = x.nextLine();
        System.out.println("Введіть слово:");
        four = x.nextLine();
        System.out.println("Введіть слово:");
        five = x.nextLine();
        end = one + " ".concat(two + " ".concat(three) + " ".concat(four) + " ".concat(five));
        System.out.println(end);


        //Завдання 2

        System.out.println("Завдання 2");

        Scanner c = new Scanner(System.in);
        String a1, a2, a3, a4, a5, end2;
        System.out.println("Введіть слово:");
        a1 = c.nextLine();
        System.out.println("Введіть слово:");
        a2 = c.nextLine();
        System.out.println("Введіть слово:");
        a3 = c.nextLine();
        System.out.println("Введіть слово:");
        a4 = c.nextLine();
        System.out.println("Введіть слово:");
        a5 = c.nextLine();
        end2 = a1.substring(0,1) + " " + a2.substring(0,1) + " " + a3.substring(0,1) + " " + a4.substring(0,1) + " " + a5.substring(0,1) ;
        System.out.println(end2);



        //Завдання 3
        double s1, s2, s3;
        Scanner c1 = new Scanner(System.in);
        System.out.print("Введіть дробове число:");
        if (c1.hasNextDouble()){
            s1 = c1.nextDouble();
        }
        else{
            System.out.println("Помилка");
            return;
        }
        if (c1.hasNextDouble()){
            s2 = c1.nextDouble();
        }
        else{
            System.out.println("Помилка");
            return;
        }
        if (c1.hasNextDouble()){
            s3 = c1.nextDouble();
        }
        else{
            System.out.println("Помилка");
            return;
        }
            if (s1 > s2 & s1 > s3) {
                System.out.println("Найбільше число:" + s1);
            }
            else if (s2 > s1 & s2 > s3) {
                System.out.println("Найбільше число:" + s2);
            }
            else if (s3 > s1 & s3 > s2){
                System.out.println("Найбільше число:" + s3);
            }
            else {
                System.out.println("є однакові числа: " +s1 +"" +s2 +"" +s3);
            }


        //Завдання 4
        String d1, d2;
        Scanner c2 = new Scanner(System.in);
        System.out.print("Введіть ім'я:");
        d1 = c2.nextLine();
        d2 = c2.nextLine();
        System.out.println(d1.equalsIgnoreCase(d2));


        //Завдання 5
        String f1, f2;
        Scanner c3 = new Scanner(System.in);
        System.out.print("Введіть ім'я:");
        f1 = c3.nextLine();
        f2 = c3.nextLine();
        int p = f1.length();
        int l = f2.length();
        if(p > l){
            System.out.println("Перше ім'я більше");
        }
        else if (p < l) {
            System.out.println("Друге ім'я більше");
        }
        else {
            System.out.println("Однаковi");
        }
    }
}