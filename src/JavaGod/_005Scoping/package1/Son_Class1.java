package JavaGod._005Scoping.package1;

public class Son_Class1 extends Class1 {
    public static void main(String[] args) {
        Son_Class1 son_class1 = new Son_Class1();

        /**
         * 在子类中，可以访问以下成员变量：
         * （其实和在同一个包中的非子类相同）
         */
        son_class1.defaultVariable = 0;
        son_class1.protectedVariable = 0;
        son_class1.publicVariable = 0;
    }
}
