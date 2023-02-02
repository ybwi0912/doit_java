package org.example.chapter12.map.treemap;

import org.example.chapter12.collection.Member;

public class MemberTreeMapTest {
    public static void main(String[] args) {
        MemberTreeMap memberTreeMap = new MemberTreeMap();

        Member memberLee = new Member(1001, "이지원");
        Member memberSon = new Member(1002, "손민국");
        Member memberPark = new Member(1003, "박서준");
        Member memberHong = new Member(1004, "홍길동");

        memberTreeMap.addMember(memberLee);
        memberTreeMap.addMember(memberSon);
        memberTreeMap.addMember(memberPark);
        memberTreeMap.addMember(memberHong);
        memberTreeMap.showAllMember();

        memberTreeMap.removeMember(1004);
        memberTreeMap.showAllMember();
    }
}
