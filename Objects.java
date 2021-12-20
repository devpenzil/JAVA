public class Objects {
    public static void main(String[] args) {
        SampleClass classone = new SampleClass();
        SampleClass classtwo = new SampleClass();

        classone.a = 10;
        classone.b = 20;
        classtwo.a = 5;
        classtwo.b = 15;

       classone.display();
       classtwo.display();
    }
}
