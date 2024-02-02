package lk.ijse.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ChuBean {
    public ChuBean() {
        System.out.println("ChuBean Instantiated");
    }
}
