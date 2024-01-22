package study.boardproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.boardproject.domain.ArticleComment;

public interface ArticleCommentRepository extends JpaRepository<ArticleComment, Long> {
}
