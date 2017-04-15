package PersonalInfo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      @SuppressWarnings("resource")
	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
      Info obj = (Info) context.getBean("helloWorld");
      obj.gettest();
      obj.getAddress();
   }
}