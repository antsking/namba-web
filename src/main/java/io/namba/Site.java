package io.namba; /**
 * Created by Evan on 16/10/16.
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.Iterator;
import java.util.List;

@SpringBootApplication
@EnableScheduling
public class Site {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Site.class, args);
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("Beans.xml");
        context.start();

        User user1 = context.getBean("user",User.class);
        user1.setEmail("evan.universe.suo@gmail.com");
        user1.getEmail();

        User user2 = context.getBean("user",User.class);
        user2.getEmail();

        System.out.println(user1.getFullTimeJob().getSalary());
        System.out.println(user2.getPartTimeJob().getSalary());

        List userFriends = user1.getFriends();
        Iterator itr = userFriends.iterator();
        while (itr.hasNext()){
            String friend = (String)itr.next();
            System.out.println(friend);
        }

        CustomEventPublisher publisher = context.getBean("customEventPublisher",CustomEventPublisher.class);
        publisher.publish();

        context.stop();

    }

}