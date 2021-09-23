package activities;


class CustomException extends Exception {
    private String msg = null;

    public CustomException(String message) {
        this.msg = message;
    }

    @Override
    public String getMessage() {
        return msg;
    }
}

public class Activity8 {
    public static void main(String[] a){
        try {
           
            Activity8.exceptionTest("Will print to console");
            
            Activity8.exceptionTest(null);
            Activity8.exceptionTest("Won't execute");
        } catch(CustomException mae) {
            System.out.println("catch: " + mae.getMessage());
        }
    }

    static void exceptionTest(String s) throws CustomException {
        if(s == null) {
            throw new CustomException("String value null");
        } else {
            System.out.println(s);
        }
    }
}