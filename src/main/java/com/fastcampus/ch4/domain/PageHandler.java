package com.fastcampus.ch4.domain;

public class PageHandler {

    private int totalCnt;
    private int pageSize;
    private int naviSize = 10; // 페이지 내비게이션 크기
    private int totalPage;
    private int page;
    private int beginPage; // 내비게이션 첫번째 페이지
    private int endPage; // 내비게이션 마지막 페이지
    private boolean showPrev; // 이전 페이지 이동 링크 표시 여부
    private boolean showNext; // 다음 페이지 이동 링크 표시 여부

    public PageHandler(int totalCnt, int page) {
        this(totalCnt, page, 10);
    }

    public PageHandler(int totalCnt, int page, int pageSize) {
        this.totalCnt = totalCnt;
        this.page = page;
        this.pageSize = pageSize;

        totalPage = (int) Math.ceil(totalCnt / pageSize);
        beginPage = page / naviSize * naviSize + 1;
        endPage = Math.min(beginPage + naviSize, totalPage);
        showPrev = beginPage != 1;
        showNext = endPage != totalPage;
    }

    void print() {

    }

}
