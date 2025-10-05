import java.util.Scanner;
import java.util.ArrayList;

public class Methods {
    Scanner scanner = new Scanner(System.in);

    public int inputInt() {
        int number;
        while (true) {
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                break;

            } else {
                System.out.print("Ошибка! Введите целое число: ");
                scanner.next();
            }
        }
        return number;
    }

    public void task12() {
        Person person1 = new Person("Клеопатра", 152);
        Person person2 = new Person("Пушкин", "Александр", "Сергеевич", 167);
        Person person3 = new Person("Владимир", 189);
        person3.setSurname("Маяковский");
        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person3.toString());
    }

    public void task34() {
        Way way1 = new Way();
        Way way2 = new Way();
        Way way3 = new Way();
        Way way4 = new Way();
        Way way5 = new Way();
        Way way6 = new Way();
        Way way7 = new Way();
        Way way8 = new Way();
        Way way9 = new Way();
        Way way10 = new Way();
        Way way11 = new Way();
        Way way12 = new Way();
        Way way13 = new Way();
        ArrayList<Way> ways1 = new ArrayList<>();
        way1.setTitlePrice("B", 5);
        way2.setTitlePrice("F", 1);
        way3.setTitlePrice("D", 6);
        ways1.add(way1);
        ways1.add(way2);
        ways1.add(way3);
        Cities city1 = new Cities("A", ways1);
        ways1.clear();
        way4.setTitlePrice("A", 5);
        way5.setTitlePrice("C", 3);
        ways1.add(way4);
        ways1.add(way5);
        Cities city2 = new Cities("B", ways1);
        ways1.clear();
        way6.setTitlePrice("B", 3);
        way7.setTitlePrice("D", 4);
        ways1.add(way6);
        ways1.add(way7);
        Cities city3 = new Cities("C", ways1);
        ways1.clear();
        way8.setTitlePrice("C", 4);
        way9.setTitlePrice("E", 2);
        way10.setTitlePrice("A", 6);
        ways1.add(way8);
        ways1.add(way9);
        ways1.add(way10);
        Cities city4 = new Cities("D", ways1);
        ways1.clear();
        way11.setTitlePrice("F", 2);
        ways1.add(way11);
        Cities city5 = new Cities("E", ways1);
        ways1.clear();
        way12.setTitlePrice("B", 1);
        way13.setTitlePrice("E", 2);
        ways1.add(way12);
        ways1.add(way13);
        Cities city6 = new Cities("F", ways1);
        ways1.clear();
        System.out.println(city1.toString());
        System.out.println(city2.toString());
        System.out.println(city3.toString());
        System.out.println(city4.toString());
        System.out.println(city5.toString());
        System.out.println(city6.toString());
    }

    public void task5() {
        Fraction fraction1 = new Fraction(3, 7);
        Fraction fraction2 = new Fraction(4, 9);
        Fraction fraction3 = new Fraction();
        Fraction fraction4 = new Fraction();
        Fraction fraction5 = new Fraction();
        Fraction fraction6 = new Fraction();
        Fraction fraction7 = new Fraction();
        fraction1.reduction(fraction1);
        fraction3.addition(fraction1, fraction2, fraction3);
        System.out.println(fraction1.toString() + " + " + fraction2.toString() + " = " + fraction3.toString());
        fraction3.additionInt(fraction1, 2, fraction3);
        System.out.println(fraction1.toString() + " + 2 = " + fraction3.toString());
        fraction4.subtraction(fraction1, fraction2, fraction4);
        System.out.println(fraction1 + " - " + fraction2 + " = " + fraction4);
        fraction4.subtractionint(fraction1, 2, fraction4);
        System.out.println(fraction1 + " - 2 = " + fraction4);
        fraction5.multiplication(fraction1, fraction2, fraction5);
        System.out.println(fraction1 + " * " + fraction2 + " = " + fraction5);
        fraction5.multiplicationint(fraction1, 2, fraction5);
        System.out.println(fraction1 + " * 2 = " + fraction5);
        if (fraction2.getNumerator() != 0) {
            fraction6.division(fraction1, fraction2, fraction6);
            System.out.println(fraction1 + " / " + fraction2 + " = " + fraction6);
        }
        else {
            System.out.println("Ошибка: Деление на 0");
        }
        int n = 2;
        fraction6.divisionint(fraction1, n, fraction6);
        System.out.println(fraction1 + " / " + n + " = " + fraction6);
        System.out.println("f1 = " + fraction1.toString());
        System.out.println("f2 = " + fraction2.toString());
        System.out.println("f3 = " + fraction3.toString());
        fraction1.addition(fraction1,fraction2,fraction1).division(fraction1,fraction3,fraction1).subtractionint(fraction1,5,fraction1);
        System.out.println("((f1 + f2) / f3) - 5 = " + fraction1.toString());
    }
}
