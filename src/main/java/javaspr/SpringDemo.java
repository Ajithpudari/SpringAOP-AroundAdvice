package javaspr;



import javaspr.bean.MyBusinessService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

    public class SpringDemo {

        public static void main(String a[]){

            String confFile = "applicationContext.xml";
            ConfigurableApplicationContext context =
                    new ClassPathXmlApplicationContext(confFile);
            MyBusinessService busServ = (MyBusinessService) context.getBean("busService");
            busServ.runMyBusinessLogic();
        }
    }
