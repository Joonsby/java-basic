package memory;

public class JavaMemoryMain2 {
    public static void main(String[] args) {
        System.out.println("main start1");
        method1();
        System.out.println("main end");
    }

    static void method1() {
        System.out.println("method1 start1");
        Data data1 = new Data(10);
        method2(data1);
    }

    static void method2(Data data2) {
        System.out.println("method2 start2");
        System.out.println("data.value=" + data2.getValue());
        System.out.println("method2 end");
    }
}
