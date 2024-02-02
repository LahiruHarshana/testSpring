package lk.ijse;

import lk.ijse.bean.ChuBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        ChuBean bean = ctx.getBean(ChuBean.class);
        System.out.println(bean);



    }
}
