package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "memberA", Grade.VIP);  // 새로운 회원
        memberService.join(member);  // 새로운 회원인 memberA를 가입시킴

        Member findMember = memberService.findMember(1L);  // id가 1L인 회원을 find
        System.out.println("new member = " + member.getName());
        System.out.println("find member = " + findMember.getName());
    }
}
