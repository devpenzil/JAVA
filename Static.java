public class Static {
    int a = 10;
    public static void main(String[] args) {
        Static h = new Static();
        h.hello();
        System.out.println(h.a);
    }
    void hello(){
        System.out.println("Hello world");
    }
}
