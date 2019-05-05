package encrypt.service;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class MyMessage {

    private String text;

    public MyMessage() {
    }

    public MyMessage(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
