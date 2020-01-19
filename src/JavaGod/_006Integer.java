package JavaGod;

/**
 * 聊聊整型中的几个类型：byte, short , int , long
 */

public class _006Integer {
    public static void main(String[] args) {
        int i = Integer.MAX_VALUE;
        int j = Integer.MAX_VALUE;

        int k = i + j;

        System.out.println("i:" + i + " + j:" + j + " = k:" + k);
        /**
         * 输出为：
         * i:2147483647 + j:2147483647 = k:-2
         * 此时发生了溢出，但是不会有报警出现，请注意！
         */
    }
}
/**
 *     byte：byte用1个字节来存储，范围为-128(-2^7)到127(2^7-1)，在变量初始化的时候，byte类型的默认值为0。
 *
 * 　　short：short用2个字节存储，范围为-32,768 (-2^15)到32,767 (2^15-1)，在变量初始化的时候，
 * short类型的默认值为0，一般情况下，因为Java本身转型的原因，可以直接写为0。
 *
 * 　　int：int用4个字节存储，范围为-2,147,483,648 (-2^31)到2,147,483,647 (2^31-1)，
 * 在变量初始化的时候，int类型的默认值为0。
 *
 * 　　long：long用8个字节存储，范围为-9,223,372,036,854,775,808 (-2^63)到9,223,372,036, 854,775,807 (2^63-1)，
 * 在变量初始化的时候，long类型的默认值为0L或0l，也可直接写为0。
 */
