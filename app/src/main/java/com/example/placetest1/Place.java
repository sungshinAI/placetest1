package com.example.placetest1;

public class Place {
    private String name;
    private long votes;

    public Place() {
        // 기본 생성자 필요 (Firebase에서 객체로 변환하기 위함)
    }

    public Place(String name, long votes) {
        this.name = name;
        this.votes = votes;
    }

    public Place(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}