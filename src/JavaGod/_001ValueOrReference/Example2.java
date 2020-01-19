package JavaGod._001ValueOrReference;

public class Example2 {
    String name;
    int age;

    public Example2(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Example2 example2 = new Example2("Gordenyou", 24);
        changeName(example2);
        System.out.println("Name in main:" + example2.name);
    }

    public static void changeName(Example2 example2){
        example2.setName("HAHA");
        System.out.println("Name in changeName:" + example2.name);
    }

    /**
     * 运行结果
     * Name in changeName:HAHA
     * Name in main:HAHA
     *
     * 当我们传入一个实例当作参数时，表明的难道是：引用传递？
     * 我们再看看下一个例子，String作为一个对象，当作参数传入时会发生什么？
     */
}
