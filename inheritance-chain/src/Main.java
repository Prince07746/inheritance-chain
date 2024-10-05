
public class Main {
    public static void main(String[] args) {

        Person p1 = new Man("prince");
        Person p2 = new WoMan("davina");
        Person p3 = new WoMan("davina");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());

        Person p4 = new WorkerMan("prince",1600.0,"Sofware eng",9);
        Person p5 = new WorkerWoMan("hana",1500,"education",8);
        Person p6 = new WorkerWoMan("sofia",1700,"IT",12);
        System.out.println(p4.toString());
        p4.work();
        System.out.println(p5.toString());
        p5.work();
        System.out.println(p6.toString());
        p6.work();




    }
}
abstract class Person{
    String name;
    String gender;
    public Person(String name,String gender){
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }
    public void work(){

    };

    @Override
    public String toString() {
        return "\n\tName "+name;
    }
}





class Man extends Person{
    public Man(String name){
        super(name,"Man");
    }


    @Override
    public String toString() {
        return
                "\n\t gender='" + gender +
                "\n\t name='" + name;
    }
}

class WorkerMan extends Man{
    double salary;
    String work;
    double workHours;
    public WorkerMan(String name,double salary,String work,double workHours){
        super(name);
        this.salary = salary;
        this.work = work;
        this.workHours = workHours;
    }
    public double getSalary() {
        return salary;
    }
    public double getWorkHours() {
        return workHours;
    }
    public void setWorkHours(double workHours) {
        this.workHours = workHours;
    }
    public void setWork(String work) {
        this.work = work;
    }
    @Override
    public void work(){
        System.out.println(name+" work in "+work);
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return super.toString()+"\n\t salary: "+salary+"\n\t work: "+work+"\n\t workHours: "+workHours;
    }
}




class WoMan extends Person{
    public WoMan(String name){
        super(name,"Woman");
    }
    @Override
    public String toString() {
        return
                "\n\t gender='" + gender +
                "\n\t name='" + name;
    }
}

class WorkerWoMan extends WoMan{
    double salary;
    String work;
    double workHours;
    public WorkerWoMan(String name,double salary,String work,double workHours){
        super(name);
        this.salary = salary;
        this.work = work;
        this.workHours = workHours;
    }
    public double getSalary() {
        return salary;
    }
    public double getWorkHours() {
        return workHours;
    }
    public void setWorkHours(double workHours) {
        this.workHours = workHours;
    }
    public void setWork(String work) {
        this.work = work;
    }
    @Override
    public void work(){
        System.out.println(name+" work in "+work);
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return super.toString()+"\n\t salary: "+salary+"\n\t work: "+work+"\n\t workHours: "+workHours;
    }
}
