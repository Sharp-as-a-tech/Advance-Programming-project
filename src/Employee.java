public class Employee {
    public static void main(String[] args){
        EmpSetGet emp=new EmpSetGet();
        emp.setEmpId(101);
        emp.setName("SoHaila");
        emp.setAge(20);
        System.out.println(emp.getEmpId());
        System.out.println(emp.getName());
        System.out.println(emp.getAge());

    }
}
