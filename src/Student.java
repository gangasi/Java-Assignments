public class Edureka{
    String studentName;
    Edureka(String name){
        studentName = name;
    }
    Edureka(Edureka myObj){
        this.studentName = myObj.studentName;
    }
    void display(){
        System.out.println("Student:" + studentName);
    }
    public static void main(String args[])
    {
        Edureka obj1 = new Edureka("Manan");
        /* passing the object as an argument for the constructor
         * this will invoke the copy constructor
         */
        Edureka obj2 = new Edureka(obj1);
        System.out.println("Printing obj1 - ");
        obj1.display();
        System.out.println("Printing obj2 - ");
        obj2.display();
    }
}
