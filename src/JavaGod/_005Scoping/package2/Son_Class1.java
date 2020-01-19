package JavaGod._005Scoping.package2;

import JavaGod._005Scoping.package1.Class1;

public class Son_Class1 extends Class1 {
    public static void main(String[] args) {
        Son_Class1 son_class1 = new Son_Class1();

        /**
         * 在不同的包中，子类只可以访问protected 和 public 类型。 default是无法访问的。
         */
        son_class1.protectedVariable = 0;
        son_class1.publicVariable = 0;
    }
}
