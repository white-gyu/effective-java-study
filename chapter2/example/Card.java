package chapter2.example;

public enum Card {
    KAKAO("KAKAO", new KakaoPayment()),
    NAVER("NAVER", new NaverPayment());

    private final String name;
    private final Payment payment;

    Card(String name, Payment payment) {
        this.name = name;
        this.payment = payment;
    }

    public String getName() {
        return this.name;
    }

    public Payment getPayment() {
        return this.payment;
    }
}
