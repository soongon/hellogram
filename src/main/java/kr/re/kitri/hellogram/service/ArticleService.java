package kr.re.kitri.hellogram.service;

import kr.re.kitri.hellogram.model.Article;
import kr.re.kitri.hellogram.repository.ArticleRepository;

public interface ArticleService {

    // 전체 글보기
    String getAllArticles();

    // 글 상세보기
    String getArticleById(String articleId);

    // 글쓰기
    String writeArticle(Article article);

    // 글 수정

    // 좋아요 누르기 .. 좋아요 1 증가

    // 글 삭제


}
