package SingletonClass;

// Only one instance of the class can be created
public class SingletonClass {
    
    public static SingletonClass classVariable = null;

    // NOTE - The consturctor has been declared as private
    private SingletonClass()
    {
        System.out.println("Hello, I am the Singleton class constructor");
    }
    
    // The function is synchronized for thread safety
    // This is a static function so needs to be called using the class
    public static synchronized SingletonClass SingletonClass()
    {
        if (classVariable == null)
        {
            classVariable = new SingletonClass();
        }
        return classVariable;
    }
}
