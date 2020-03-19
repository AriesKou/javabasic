package using.constructor;

public class Person{
    private String name;
    private int age;
    private String profession;

    private Person(String name,int age,String profession){
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    /*
    例子可能不是太恰当，但是这两个静态方法的可读性相较于原始的构造函数就会好一些。
    使用API的人很清楚地知道自己要用那个方法创建person 对象
    */
    public static final Person create1Student(String studentName,int studentAge){
        return new Person(studentName,studentAge,"Student");
    }

    public static final Person create1Doctor(String doctorName,int doctorAge){
        return new Person(doctorName,doctorAge,"Doctor");
    }

}