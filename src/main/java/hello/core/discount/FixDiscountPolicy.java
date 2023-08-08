package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {

    private int discountFixAmount = 1000;  // 1000원 할인

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {  // enum 타입은 == 사용해야 됨
            return discountFixAmount;  // 1000원 할인
        } else {
            return 0;  // 할인 x
        }
    }
}