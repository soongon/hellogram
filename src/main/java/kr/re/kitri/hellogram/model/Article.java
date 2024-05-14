package kr.re.kitri.hellogram.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Article {
//    {
//        "articleId": 5,
//            "title": "테스트 입니다.",
//            "body": "테스트 본문입니다.",
//            "author": "김순곤",
//            "likes": 0
//    }
    private long articleId;
    private String title;
    private String body;
    private String author;
    private int likes;
}
