package JavaGod._001ValueOrReference;

public class Example3 {
    public static void main(String[] args) {
        String test = "Hello Gordenyou";
        changeTest(test);
        System.out.println("Test in main:" + test);
    }

    public static void changeTest(String test) {
        test = "Have test change?";
        System.out.println("Test in changeTest:" + test);
    }

    /**
     * 运行结果
     * Test in changeTest:Have test change?
     * Test in main:Hello Gordenyou
     *
     * 可以看到：String作为一个对象传入时，和我们普通的对象还是有区别的。
     *
     * 正确结论：
     * 无论是值传递还是引用传递，其实都是一种求值策略(Evaluation strategy)。在求值策略中，
     * 还有一种叫做按共享传递(call by sharing)。其实Java中的参数传递严格意义上说应该是按共享传递。
     *
     * 按共享传递，是指在调用函数时，传递给函数的是实参的地址的拷贝（如果实参在栈中，则直接拷贝该值）。
     * 在函数内部对参数进行操作时，需要先拷贝的地址寻找到具体的值，再进行操作。如果该值在栈中，
     * 那么因为是直接拷贝的值，所以函数内部对参数进行操作不会对外部变量产生影响。如果原来拷贝的是原值在堆中的地址，
     * 那么需要先根据该地址找到堆中对应的位置，再进行操作。因为传递的是地址的拷贝所以函数内对值的操作对外部变量是可见的。
     *
     * 简单点说，Java中的传递，是值传递，而这个值，实际上是对象的引用。
     *
     * 而按共享传递其实只是按值传递的一个特例罢了。所以我们可以说Java的传递是按共享传递，或者说Java中的传递是值传递。
     *
     * https://github.com/hollischuang/toBeTopJavaer/blob/master/basics/java-basic/java-pass-by.md
     */
}
