package code.test.policy;

public class DiscountPolicy {

    // 1. 금액 할인 정책인지 비율 할인 정책인지 확인
    // 2. 금액 할인 정책이면 800원 리턴, 비율 정책이면 비율 리턴
    // 금액을 계산할 수 있는 클래스 필요
    private double finalDiscountAmount;
    private static final int amountDiscount = 800;
    private static final double rateDiscount = 0.1;

    public double checkDiscountPolicy(Discount confirmDiscount) {
        switch (confirmDiscount) {
            case NO:
                finalDiscountAmount = 0;
                return finalDiscountAmount;
            case RATE:
                finalDiscountAmount = rateDiscount;
                return finalDiscountAmount;
            case AMOUNT:
                finalDiscountAmount = amountDiscount;
                return finalDiscountAmount;
        }
        return finalDiscountAmount;
    }

}
