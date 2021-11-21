package OOPSAssignments;

// Java assignment for Abstract class
// class with abstract method
abstract class AbstractMain {
    // Abstract method with signature
    public abstract void denominations();
}
// base class using abstract method and providing body to method
class SbiBank extends AbstractMain{
    public void denominations(){
        System.out.println("Available denomination in SBI: 2000, 500, 200" );
    }
}
// base class using abstract method and providing body to method
class IciciBank extends AbstractMain{
    public void denominations(){
        System.out.println("Available denomination in ICICI: 2000, 1000, 200" );
    }
}
// base class using abstract method and providing body to method
class HdfcBank{
    public void denominations(){
        System.out.println("Available denomination in HDFC: 500, 200, 100" );
    }
}
//Main method
class Main {
    public static void main(String[] args) {
        // creating object of class
        SbiBank sb = new SbiBank();
        // calling method
        sb.denominations();
        // creating object of class
        IciciBank ic = new IciciBank();
        // calling method
        ic.denominations();
        // creating object of class
        HdfcBank hd = new HdfcBank();
        // calling method
        hd.denominations();
    }
}

