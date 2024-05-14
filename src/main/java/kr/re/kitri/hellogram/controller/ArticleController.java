package kr.re.kitri.hellogram.controller;

import kr.re.kitri.hellogram.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleController {

    private final ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    // 글 전체보기
    @GetMapping("/articles")
    public String articles() {
        // 글전체보기 요청이 왔을때 /articles .. 모든글을 조회해서 응답해준다.
        return articleService.getAllArticles();
    }
}
