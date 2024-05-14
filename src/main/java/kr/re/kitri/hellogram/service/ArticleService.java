package kr.re.kitri.hellogram.service;

import kr.re.kitri.hellogram.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// 글에 대한 기능을 포함하고 있다.
@Service
public class ArticleService {

    private final ArticleRepository articleRepository;

    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    // 전체 글보기
    public String getAllArticles() {
        return articleRepository.selectArticles();
    }

    // 글 상세보기
    public String getArticleById(String articleId) {
        // 글번호 줄게 실제 데이터베이스 조회해서 글상세내용 갖다줘..
        return articleRepository.selectArticleDetailsById(articleId);
    }

    // 글 수정

    // 좋아요 누르기 .. 좋아요 1 증가

    // 글 삭제

    // 글쓰기
}
