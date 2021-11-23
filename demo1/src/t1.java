//import org.springframework.aop.framework.AopContext;

import java.util.Date;

public class t1 {
    public static final ThreadLocal<Object> contextHolder = new ThreadLocal<>();

    public static void main(String[] args) {
        contextHolder.set(2021);
//        System.out.println(contextHolder.get());
//        new t1().lala();
        System.out.println(new Date().getTime());
    }

    public void lala(){

    }

}
