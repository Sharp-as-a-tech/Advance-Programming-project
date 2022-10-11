abstract class Student {
    private String name;
    private int Rollno;
    private String course;
     abstract int m1(int a);
}
class roomno extends Student{
    int m1(int a){
        return a;
    }
}