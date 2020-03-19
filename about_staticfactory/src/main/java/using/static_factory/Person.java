package using.static_factory;

public class Person{
    private static Person student = new Person("A",15,"Student");
    private static Person doctor = new Person("B",22,"Doctor");
    private String name;
    private int age;
    private String profession;

    private Person(String name,int age,String profession){
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public static final Person create1Student(String sutdentName,int studentAge){
        if(student != null){
            return student;
        }else{
            return new Person(sutdentName,studentAge,"Student");
        }
    }

    public static final Person create1Doctor(String doctorName,int doctorAge){
        if(doctor != null){
            return doctor;
        }else{
            return new Person(doctorName,doctorAge,"Doctor");
        }
    }

}