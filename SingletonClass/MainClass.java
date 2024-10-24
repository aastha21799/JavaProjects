package SingletonClass;

public class MainClass {

    public static void main(String[] args)
    {        
        System.out.println("Calling the singleton class");

        // SingletonClass obj1 = SingletonClass.getInstance();
        // SingletonClass obj2 = SingletonClass.getInstance();
        // SingletonClass obj3 = SingletonClass.getInstance();

        // See how the function is being called
        SingletonClass obj1 = SingletonClass.SingletonClass();
        SingletonClass obj2 = SingletonClass.SingletonClass();
        SingletonClass obj3 = SingletonClass.SingletonClass();

        // Same object is being returned. Can verify using the hashcode
        PrintHashCode("Obj1", obj1);
        PrintHashCode("Obj2", obj2);
        PrintHashCode("Obj3", obj3);

    }

    static void PrintHashCode(String objName, SingletonClass obj)
    {
        System.out.println("Printing the hashcode of " + objName + " " + obj.hashCode());
    }

}
