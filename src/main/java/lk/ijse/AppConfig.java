package lk.ijse;

import lk.ijse.bean.ChuBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = ChuBean.class)
public class AppConfig {
    public AppConfig() {
        System.out.println("AppConfig Instantiated");
    }
}
