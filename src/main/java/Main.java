import com.alibaba.fastjson.JSON;
import com.xz.config.AppConfig;
import com.xz.interfaces.FriendsService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author xz
 * @date 2019/12/12 16:25
 **/

public class Main {
    public static void main(String[] args) {

        //dev分支第一次提交

        AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
        //annotationConfigApplicationContext.register(User.class);
        //annotationConfigApplicationContext.refresh();

        System.out.println("student:"+annotationConfigApplicationContext.getBean("bbb"));
        System.out.println("MyFactoryBean:"+JSON.toJSONString(annotationConfigApplicationContext.getBean("&bbb")));

        /**
         * mybatis-spring   (MapperProxy)MapperProxy.invoke--->(MapperMethod)mapperMethod.execute--->(MapperMethod)sqlSession.selectOne--->(SqlSessionTemplate)this.sqlSessionProxy.selectOne--->SqlSessionTemplate)sqlSessionTemplate.invoke(finally closeSqlSession)
         *
         */
        System.out.println(JSON.toJSONString(annotationConfigApplicationContext.getBean(FriendsService.class).getFriendById(2)));
    }
}
