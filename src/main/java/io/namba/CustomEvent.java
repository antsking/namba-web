package io.namba;

import org.springframework.context.ApplicationEvent;

/**
 * Created by Evan on 23/10/16.
 */
public class CustomEvent extends ApplicationEvent {
    public CustomEvent(Object source) {
        super(source);
    }

    @Override
    public String toString() {
        return "custom event";
    }
}
