package study.boardproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.boardproject.domain.Article;

public interface ArticleRepository extends JpaRepository<Article,Long> {
}
