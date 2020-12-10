import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld beansecond = applicationContext.getBean("helloworld", HelloWorld.class);
        boolean compare = bean == beansecond;
        System.out.println(compare);

        Cat beanCat = applicationContext.getBean("Cat", Cat.class);
        System.out.println(beanCat.getVoice());
        Cat beanSecondCat = applicationContext.getBean("Cat", Cat.class);
        boolean compareCat = beanCat == beanSecondCat;
        System.out.println(compareCat);




    }
}