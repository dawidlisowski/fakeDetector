package pl.dawidlisowski.fdetector.models.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import pl.dawidlisowski.fdetector.models.entities.NewsEntity;
import pl.dawidlisowski.fdetector.models.forms.NewsForm;
import pl.dawidlisowski.fdetector.models.repositories.NewsRepository;

import java.util.List;

@Service
public class NewsService {

    final NewsRepository newsRepository;

    @Autowired
    public NewsService(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }

    public void addNewNews(NewsForm newsForm) {
        newsRepository.save(new NewsEntity(newsForm));
    }

    public Iterable<NewsEntity> loadAllNews() {
        return newsRepository.findAll();
    }

    public Page<NewsEntity> loadPage(int page) {
        return newsRepository.findAll(PageRequest.of(page, 2));
    }
}
