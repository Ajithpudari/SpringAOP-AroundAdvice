package javaspr.bean;

public class MyBusinessService {
    public String runMyBusinessLogic() {
        System.out.println("************************************");
        System.out.println("Running business logic");
        System.out.println("************************************");

        return "Successfully executed my business logic";
    }

    public void testThrowException() {
        throw new NullPointerException();
    }
}