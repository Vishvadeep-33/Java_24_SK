public class App {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student();
        s1.setAge(10);
        s1.setName("John");
        s1.setRollNo(10);
        System.out.println(s1.age + " " + s1.name + " " + s1.rollNo);
        Student s2 = new Student();
        s2.setAge(10);
        s2.setName("Jon");
        s2.setRollNo(1);
        s2.display();



    }

}
class Student{
    int age;
    String name;
    int rollNo;
    // constructor
   /*  public Student(int age, String name, int rollNo) {
        this.age = age;
        this.name = name;
        this.rollNo = rollNo;
    } */
    // method
    public void display(){
        System.out.println(age + " " + name + " " + rollNo);
    }
    // getter and setter
    // set meaning setting value to variable
    // get meaning getting value from a variable
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }
}


/* 
 * 
 * create a class named bank that has the follwing methods
 * getter and setter for username and password
 * withdraw,deposite, check balance and (transfer to other account(optional))
 * 
 */