package org.team3_study.section01.teammember;

public class Jhlee extends TeamMember {
    private final String phoneNumber = "010-4909-6515";
    private final String name = "이준형";

    @Override
    public void introduceMySelf() {
        System.out.println("3조 이준형입니다. 반갑습니다.");
    }

    @Override
    public void planning() {
        System.out.println("Kotlin도 사용해보자.");
    }
}
