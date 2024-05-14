package kr.re.kitri.hellogram.repository;

import kr.re.kitri.hellogram.model.Article;
import org.springframework.stereotype.Repository;

// 테이블만 바라보는 바보
// article 테이블로 1:1로 매핑
@Repository
public class ArticleRepository {
    // article 테이블에서 모든 글 보기
    // select * from article;
    public String selectArticles() {
        // 실제 쿼리 수행
        return "디비에서 데이터 가져와서 전달합니다.";
    }

    // 글상세보기 by 글번호
    public String selectArticleDetailsById(String articleId) {
        // 실제 쿼리 수행
        return articleId + "번 글 상세내용입니다.";
    }

    public String insertArticle(Article article) {
        // 실제로 aritlce 데이터를 데이터베이스에 인서트 수행..
        // insert into article values(.......)
        System.out.println("레파지토리 로그: " + article);
        return "잘 인서트 됬습니다.";
    }
}
