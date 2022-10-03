package dev;

public class DevInterface {

    public static void main(String[] args) {
        DI1Class c1 = new DI1Class();
        System.out.println(c1.f1());
    }

}

class DI1Class implements DI1Interface {
    @Override
    public int f1() {
        return 0;
    }
}

interface DI1Interface {
    int f1();
}