package collection.HashSet;

import collection.Member;

import java.util.HashSet;

public class MemberHashSetTest {
    public static void main(String[] args) {
        MemberHashSet memberHashSet = new MemberHashSet();

        Member mem1 = new Member(101, "LEE");
        Member mem2= new Member(102, "KIM");
        Member mem3 = new Member(103, "HA");

        memberHashSet.addMember(mem1);
        memberHashSet.addMember(mem2);
        memberHashSet.addMember(mem3);

        memberHashSet.showAll();

        Member mem4 = new Member(101, "KK");
        memberHashSet.addMember(mem4);
        memberHashSet.showAll();
    }
}
