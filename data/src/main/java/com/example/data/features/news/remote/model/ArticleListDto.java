package com.example.data.features.news.remote.model;

import com.example.data.features.news.remote.model.ArticleDto;

import java.util.List;

public class ArticleListDto {
    public final int totalResults;
    public final List<ArticleDto> articles;

    ArticleListDto(int totalResults, List<ArticleDto> articles) {
        this.totalResults = totalResults;
        this.articles = articles;
    }
}
