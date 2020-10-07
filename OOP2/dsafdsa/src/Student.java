public class Student {
    String name;

    public Student(String name){
        this.name=name;
    }
    @Override
    public String toString (){
        return "Person Name =' " + name + "'";
    }
}
