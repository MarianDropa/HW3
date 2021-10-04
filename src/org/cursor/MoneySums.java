package org.cursor;

public class MoneySums {
    public static void main(String[] args) {
        Money sum1 = new Money(34, (byte) 15);
        Money sum2 = new Money(25, (byte) 13);
        System.out.println("Adding: = " + Money.add(sum1, sum2));
        System.out.println("Subtraction: = " + Money.sub(sum1, sum2));
        System.out.println("Multiply: = " + Money.mult(sum1, sum2));
        System.out.println("Divide: = " + Money.div(sum1, sum2));
        System.out.println("Divide Fractal: = " + Money.multFract(sum1, new Money(0.58)));
        System.out.println("Multiply Fractal: = " + Money.divFract(sum1, new Money(0.27)));
        System.out.println("Money sum1 > Money sum2 " + Money.comp1(sum1, sum2));
        System.out.println("Money sum1 < Money sum2 " + Money.comp2(sum1, sum2));
        System.out.println("Money sum1 = Money sum2 " + Money.comp3(sum1, sum2));

    }
}

class Money {
    private long grn;
    private byte kop;

    public Money(long grn, byte kop) {
        this.grn = grn;
        this.kop = kop;
    }

    public Money(double sum) {
        this.grn = (long) sum;
        this.kop = (byte) ((sum - grn) * 100);
    }

    public double sumValue() {
        return grn + (double) kop / 100;
    }

    public static Money add(Money sum1, Money sum2) {
        return new Money(sum1.sumValue() + sum2.sumValue());
    }

    public static Money sub(Money sum1, Money sum2) {
        return new Money(sum1.sumValue() - sum2.sumValue());
    }

    public static Money mult(Money sum1, Money sum2) {
        return new Money(sum1.sumValue() * sum2.sumValue());
    }

    public static Money multFract(Money money, Money sum1) {
        return new Money(sum1.sumValue() * 0.55);
    }

    public static Money div(Money sum1, Money sum2) {
        return new Money(sum1.sumValue() / sum2.sumValue());
    }

    public static Money divFract(Money money, Money sum1) {
        return new Money(sum1.sumValue() / 0.2);
    }

    public static boolean comp1(Money sum1, Money sum2) {
        return sum1.sumValue() > sum2.sumValue();
    }

    public static boolean comp2(Money sum1, Money sum2) {
        return sum1.sumValue() < sum2.sumValue();
    }

    public static boolean comp3(Money sum1, Money sum2) {
        return sum1.sumValue() == sum2.sumValue();
    }

    @Override
    public String toString() {
        return grn + "," + kop;
    }
}
