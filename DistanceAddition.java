class Distance {
    int m, cm, mm;

    void set(int meter, int centimeter, int millimeter) {
        m = meter; cm = centimeter; mm = millimeter;
    }

    void display() {
        System.out.println(m + " m " + cm + " cm " + mm + " mm");
    }

    Distance add(Distance d) {
        Distance res = new Distance();
        res.mm = mm + d.mm;
        res.cm = cm + d.cm + res.mm / 10;
        res.mm = res.mm % 10;
        res.m = m + d.m + res.cm / 100;
        res.cm = res.cm % 100;
        return res;
    }
}

public class DistanceAddition {
    public static void main(String args[]) {
        Distance d1 = new Distance();
        Distance d2 = new Distance();

        d1.set(2, 75, 8);
        d2.set(3, 50, 7);

        System.out.print("Distance 1: "); d1.display();
        System.out.print("Distance 2: "); d2.display();

        Distance sum = d1.add(d2);
        System.out.print("Sum: "); sum.display();
    }
}
