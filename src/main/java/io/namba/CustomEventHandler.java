package io.namba;

import org.springframework.context.ApplicationListener;

/**
 * Created by Evan on 23/10/16.
 */
public class CustomEventHandler implements ApplicationListener<CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent customEvent) {
        System.out.println(customEvent.toString());
    }
}
