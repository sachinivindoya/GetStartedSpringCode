package lk.ijse.gdse.aad.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Prabash {
    @Qualifier("Long Hair")
    @Autowired
    @PureLove
    private Love love;



    Prabash(){
        System.out.println("constructor = " +love);
    }
    @PostConstruct
    void initLove(){
        System.out.println("Init Value = " +love);
        love.kiss();
    }
}
