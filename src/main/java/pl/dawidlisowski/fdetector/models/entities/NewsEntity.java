package pl.dawidlisowski.fdetector.models.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import pl.dawidlisowski.fdetector.models.forms.NewsForm;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "post")
@NoArgsConstructor
public class NewsEntity {
    @Id @GeneratedValue
    private int id;
    private String title;
    private @Column(name = "news_content") String newsContent;
    private @Column(name = "news_fake_provement") String newsFakeProvement;
    private @Column(name = "news_origin") String newsOrigin;
    private String author;
    private @Column(name = "create_date") LocalDateTime createDate;

    public NewsEntity(NewsForm newsForm) {
        this.title = newsForm.getTitle();
        this.newsContent = newsForm.getNewsContent();
        this.newsFakeProvement = newsForm.getNewsFakeProvement();
        this.newsOrigin = newsForm.getNewsOrigin();
        this.author = newsForm.getAuthor();
    }
}
