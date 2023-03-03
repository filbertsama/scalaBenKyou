import java.util.ArrayList;

public class Test {



    public static void main(String[] args) {

        System.out.println(Person.getInstance());
        System.out.println(Person.getInstance());
    }
}

class Person{

    //TODO 私有的自有属性
    private static Person p = new Person();

    //TODO 构造器私有
    private Person(){

    }
    //TODO 提供公有静态的获取对象的方法
    public static Person getInstance(){
        return p;
    }
}

