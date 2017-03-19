package main.java.chapter4;

class Pwr_4_14 {
    double b;
    int e;
    double val;

    Pwr_4_14(double base, int exp) {
        b = base;
        e = exp;

        val = 1;
        if(exp==0) return;
        for( ; exp>0; exp--) val = val * base;
    }

    double get_pwr() {
        return val;
    }
}

class DemoPwr {
    public static void main(String args[]) {
        Pwr_4_14 x = new Pwr_4_14(4.0, 2);
        Pwr_4_14 y = new Pwr_4_14(2.5, 1);
        Pwr_4_14 z = new Pwr_4_14(5.7, 0);

        System.out.println(x.b + " raised to the " + x.e +
                " power is " + x.get_pwr());
        System.out.println(y.b + " raised to the " + y.e +
                " power is " + y.get_pwr());
        System.out.println(z.b + " raised to the " + z.e +
                " power is " + z.get_pwr());
    }
}