package core.juja.A1A8;

public class App4 {
    public static void main(String[] args) {
        Holder ref = new Holder(0);
        g(f(ref));
        System.out.print(ref.field);
    }
    public static Holder f(Holder arg) {
        arg.field = 2;
        arg = new Holder(3);
        return arg;
    }
    public static Holder g(Holder arg) {
        arg = new Holder(4);
        arg.field = 5;
        return arg;
    }
}
 class Holder {
    public int field;
    public Holder(int field) {
        this.field = field;
    }
}