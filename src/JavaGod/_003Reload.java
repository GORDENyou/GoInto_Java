package JavaGod;

/**
 * 聊聊重载，不要和继承多态中的子类重写父类函数搞混了。
 *
 * 以前也一直有个疑问：重载函数的类型到底可不可以改变？
 */
public class _003Reload {

    static class Parent{
        public void hello(){
            System.out.println("hello");
        }

        public int hello(int i){
            return i;
        }

        public static void hello(String hello){
            System.out.println(hello);
        }

        public void hello(double hello)throws Exception{
            System.out.println(hello);
        }
    }

    static class Son{
        //方法能够在一个子类中被重载。
        public double hello(double hello){
            System.out.println(hello);
            return hello;
        }
    }



    /**
     * 以上的例子可以看出，返回参数的类型是可以改变的。另外，重载还有以下特性：
     *
     * 1.被重载的方法必须改变参数列表；
     *
     * 2.被重载的方法可以改变返回类型；
     *
     * 3.被重载的方法可以改变访问修饰符；
     *
     * 4.被重载的方法可以声明新的或更广的检查异常；
     *
     * 5.方法能够在同一个类中或者在一个子类中被重载。
     *
     * 总结：重载所需要的就是在编译前就可以区分调用什么函数即可，所以我认为重载并不是多态的体现，
     * 因为多态是在编译之后才知道调用了什么函数。
     */
}
