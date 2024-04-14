package patterns;

public class Math {
    
    private Math() {} // Private Constructor
    private static Math instance=null; // Private Static Instance
    public static Math getInstance ()  // static getter
    {
        if (instance == null){
            instance = new Math();
            return instance;
        }
        return instance;
        
        public int sum (int a, int b) {
            return a+b;
        }
        
        public int mul (int a, int b) {
            return a*b;
        }
        public int sub (int a, int b) {
            return a-b;
        }
        
    }
}
