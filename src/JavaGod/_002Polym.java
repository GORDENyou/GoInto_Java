package JavaGod;

public class _002Polym {
    public static class Parent {

        public void call() {
            System.out.println("im Parent");
        }
    }

    public static class Son extends Parent {// 1.有类继承或者接口实现

        public void call() {// 2.子类要重写父类的方法
            System.out.println("im Son");
        }
    }

    public static class Daughter extends Parent {// 1.有类继承或者接口实现

        public void call() {// 2.子类要重写父类的方法
            System.out.println("im Daughter");
        }
    }

    public static void main(String[] args) {
        Parent p = new Son(); //3.父类的引用指向子类的对象
        Parent p1 = new Daughter(); //3.父类的引用指向子类的对象
    }

    /**
     * 所以什么是多态？
     *
     * 我认为，多态应该是一种运行期特性，Java中的重写是多态的体现。不过也有人提出重载是一种静态多态的想法，
     * 这个问题在StackOverflow等网站上有很多人讨论，但是并没有什么定论。我更加倾向于重载不是多态。
     */
}
