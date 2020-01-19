package JavaLiao._001InterfaceAndAbstract;

/**
 * 主要是来比较接口和抽象类的区别。
 * 接口中只能有静态变量；抽象类中除了私有变量，都可以有
 * 接口中可以实现默认方法；抽象类中可以实现各种方法
 * 从设计层面来说，抽象是对类的抽象，是一种模板设计，而接口是对行为的抽象，是一种行为的规范。
 */
public class Main extends AbstractTest implements Test{
    public static void main(String[] args) {
        System.out.println("The static variable is: " + variable);
//        variable = 3;    其实接口中的字段默认是 final static 修饰的。
        Test.testMethod();

        Main main = new Main();
//        main.testMethod();     但却不能用实现接口的实例调用接口的静态方法。

        System.out.println(main.getPrivateVariable());
        main.getProtectedVariable();
    }

    @Override
    void getProtectedVariable() {
        System.out.println("The protectedVariable is :" + protectedVariable);
    }
}
