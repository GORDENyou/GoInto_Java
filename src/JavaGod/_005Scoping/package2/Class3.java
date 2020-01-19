package JavaGod._005Scoping.package2;

import JavaGod._005Scoping.package1.Class1;

public class Class3 {
    public static void main(String[] args) {
        Class1 class1 = new Class1();

        /**
         * 在不同的包中，只可以访问public的成员变量
         */
        class1.publicVariable = 0;
    }
}
