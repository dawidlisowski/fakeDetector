package pl.dawidlisowski.fdetector.models.forms;

import lombok.Data;

@Data
public class NewsForm {
    private String title;
    private String newsContent;
    private String newsFakeProvement;
    private String newsOrigin;
    private String author;
}
