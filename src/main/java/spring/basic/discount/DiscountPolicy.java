package spring.basic.discount;

import spring.basic.member.Member;

public interface DiscountPolicy {
    int discount(Member member, int price);
}
