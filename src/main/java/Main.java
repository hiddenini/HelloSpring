import com.xz.bean.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author xz
 * @date 2019/12/12 16:25
 **/

public class Main {
    public static void main(String[] args) {
        //AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(AppConfig.class);

        AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext();
        annotationConfigApplicationContext.register(User.class);
        annotationConfigApplicationContext.refresh();

        System.out.println(annotationConfigApplicationContext.getBean(User.class));
    }
}
