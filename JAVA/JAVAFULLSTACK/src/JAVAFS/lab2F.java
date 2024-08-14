package JAVAFS;
class ani {
    void moves() {
        System.out.println("Run");
    }
}
class Cheetah extends ani{
    void print() {
        System.out.println("Cheetah");
    }
}
public class lab2F
{
	public static void main(String[] args) {
        Cheetah obj = new Cheetah();
        obj.print(); 
        obj.moves();  
    }
}

