package JavaGod._001ValueOrReference;

/**
 * 今天我们来讨论下Java到底是 值传递 还是 引用传递
 */
public class Example1 {
    public static void main(String[] args) {
        int test = 100;
        changeTest(test);
        System.out.println("Test in main is:" + test);
    }

    public static void changeTest(int test) {
        test = 233;
        System.out.println("Test in changeTest is:" + test);
    }


    /**
     * 运行结果
     * Test in changeTest is:233
     * Test in main is:100
     *
     * 结果表明函数并没有改变test的值，所以是值传递？
     * 请看后面的例子！
     */
}
