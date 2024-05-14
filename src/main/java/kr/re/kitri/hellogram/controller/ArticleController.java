package kr.re.kitri.hellogram.controller;

import kr.re.kitri.hellogram.model.Article;
import kr.re.kitri.hellogram.service.ArticleService;
import kr.re.kitri.hellogram.service.ArticleServiceImpl;
import org.springframework.web.bind.annotation.*;

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

    // 글 상세보기
    @GetMapping("/articles/{articleId}")
    public String articleDetails(@PathVariable String articleId) {
        // {articleID} 에 해당되는 변수를 가져온다.
        // aricleID로 글 상세보기 조회해줘
        System.out.println(articleId);
        return articleService.getArticleById(articleId);
    }

    // 글쓰기
    @PostMapping("/articles")
    public String writeArticle(@RequestBody Article article) {
        return articleService.writeArticle(article);
    }

}
