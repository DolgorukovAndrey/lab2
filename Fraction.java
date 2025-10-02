public class Fraction {
    private int numerator;
    private int denominator;

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        }
        else {
            System.out.println("Знаменатель не может быть 0 (установлено значение 1)");
            this.denominator = 1;
        }
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public Fraction() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction(Fraction fraction) {
        this.numerator = fraction.numerator;
        this.denominator = fraction.denominator;
    }

    public void reduction(Fraction fraction) {
        int a = fraction.numerator;
        int b = fraction.denominator;
        int temp;
        while (b != 0)  {
            temp = b;
            b = a % b;
            a = temp;
        }
        fraction.numerator = fraction.numerator / a;
        fraction.denominator = fraction.denominator / a;
        if (fraction.numerator < 0 && fraction.denominator < 0) {
            fraction.numerator = fraction.numerator * (-1);
            fraction.denominator = fraction.denominator * (-1);
        }
        if (fraction.numerator >= 0 && fraction.denominator < 0) {
            fraction.numerator = fraction.numerator * (-1);
            fraction.denominator = fraction.denominator * (-1);
        }
    }

    public Fraction addition(Fraction summand1, Fraction summand2, Fraction summ) {
        summ.numerator = summand1.numerator * summand2.denominator + summand2.numerator * summand1.denominator;
        summ.denominator = summand1.denominator * summand2.denominator;
        summ.reduction(summ);
        return summ;
    }

    public Fraction subtraction(Fraction summand1, Fraction summand2, Fraction summ) {
        summ.numerator = summand1.numerator * summand2.denominator - summand2.numerator * summand1.denominator;
        summ.denominator = summand1.denominator * summand2.denominator;
        summ.reduction(summ);
        return summ;
    }

    public Fraction multiplication(Fraction summand1, Fraction summand2, Fraction summ) {
        summ.numerator = summand1.numerator * summand2.numerator;
        summ.denominator = summand1.denominator * summand2.denominator;
        summ.reduction(summ);
        return summ;
    }

    public Fraction division(Fraction summand1, Fraction summand2, Fraction summ) {
        summ.numerator = summand1.numerator * summand2.denominator;
        summ.denominator = summand1.denominator * summand2.numerator;
        summ.reduction(summ);
        return summ;
    }

    public Fraction additionInt(Fraction summand1, int n, Fraction summ) {
        summ.numerator = summand1.numerator + n * summand1.denominator;
        summ.denominator = summand1.denominator;
        summ.reduction(summ);
        return summ;
    }

    public Fraction subtractionint(Fraction summand1, int n, Fraction summ) {
        summ.numerator = summand1.numerator - n * summand1.denominator;
        summ.denominator = summand1.denominator;
        summ.reduction(summ);
        return summ;
    }

    public Fraction multiplicationint(Fraction summand1, int n, Fraction summ) {
        summ.numerator = summand1.numerator * n;
        summ.denominator = summand1.denominator;
        summ.reduction(summ);
        return summ;
    }

    public Fraction divisionint(Fraction summand1, int n, Fraction summ) {
        if (n == 0) {
            throw new IllegalArgumentException("Ошибка деления на 0");
        }
        summ.numerator = summand1.numerator;
        summ.denominator = summand1.denominator * n;
        summ.reduction(summ);
        return summ;
    }

    @Override
    public String toString() {
        if (numerator != 0 && denominator != 0) {
            return numerator + "/" + denominator;
        }
        else {
            return "0";
        }
    }
}
