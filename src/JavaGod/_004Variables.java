package JavaGod;

/**
 * 来看看变量之间的区别
 */
public class _004Variables {
    /**
     * 类变量，位于jvm中的方法区
     */
    private static int classVariable;

    /**
     * 成员变量，位于jvm的堆内存中
     */
    private int memberVariable;


    public void test() {
        /**
         * 局部变量，位于jvm的栈内存中
         */
        int localVaribale;
    }
}
