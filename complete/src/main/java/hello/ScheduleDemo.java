package hello;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by admin on 2015/10/27.
 */

@Component
@EnableScheduling
@Configurable
public class ScheduleDemo {
    @Scheduled(cron = "0/10 35-55 18 * * *")
    public void testScheduleMethod(){
        System.out.println("testScheduleMethod, now time---->" + new Date());
    }
}
