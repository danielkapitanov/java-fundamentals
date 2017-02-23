package chapter4;

// A simple constructor.

class MyClass_4_10 {
    int x;

    MyClass_4_10() {
        x = 10;
    }
}

class ConsDemo {
    public static void main(String args[]) {
        MyClass_4_10 t1 = new MyClass_4_10();
        MyClass_4_10 t2 = new MyClass_4_10();

        System.out.println(t1.x + " " + t2.x);
    }
}