package collection.treeSet;

import collection.Member;

public class MemberTreeSetTest {
    public static void main(String[] args) {
        MemberTreeSet memberTreeSet = new MemberTreeSet();

        Member mem1 = new Member(102, "LEE");
        Member mem2= new Member(101, "KIM");
        Member mem3 = new Member(103, "HA");

        memberTreeSet.addMember(mem1);
        memberTreeSet.addMember(mem2);
        memberTreeSet.addMember(mem3);

        memberTreeSet.showAll();

        Member mem4 = new Member(101, "KK");
        memberTreeSet.addMember(mem4);
        memberTreeSet.showAll();
    }
}
