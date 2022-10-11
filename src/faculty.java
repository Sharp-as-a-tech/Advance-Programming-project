public class faculty {
    private String name;
    //faculty and students has composition relationship
public class students{



        public students() {
            setName();
        }

        public void setName(){
        University a=new University();
        a.setName("Kandahar University");
        System.out.println(a.getName());
    }
};
public void nameoftheuni(){

students s=new students();
s.setName();
}
}
