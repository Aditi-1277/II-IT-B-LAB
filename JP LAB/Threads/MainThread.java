public class MainThread
{
public static void main(String args[])
{
Thread t = Thread.currentThread();

System.out.println(" Current Thread Name : " + t);
t.setName("Lalitha");
System.out.println("After Changing the Name : " +t);
}
}
