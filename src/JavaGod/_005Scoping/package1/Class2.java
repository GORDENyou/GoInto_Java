package JavaGod._005Scoping.package1;

public class Class2 {
    public static void main(String[] args) {
        Class1 class1 = new Class1();

        /**
         * 在同一个包中，你可以访问以下的变量
         */
        class1.defaultVariable = 0;
        class1.protectedVariable = 0;
        class1.publicVariable = 0;
    }
}
