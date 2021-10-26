package io.github.purab;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//@Component
@ConfigurationProperties(prefix = "simple")
public class SimpleProperties {
    private String text;
    private int number;

    public void setText(String text) {
        this.text = text;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "SimpleProperties{" +
                "text='" + text + '\'' +
                ", number=" + number +
                '}';
    }
}
