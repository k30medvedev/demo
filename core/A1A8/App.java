package core.juja.A1A8;

abstract public class App {

    public abstract void f();

    public static void main(String[] args) {
        g(new Object[16], new App[16]);
    }

    private static void g(Object[] src, App[] dst) {
        for (int k = 0; k < src.length; k++) {
            dst[k] = (App) src[k];
        }
    }
}