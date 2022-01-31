package collection.arraylist;

import collection.Member;

public class MemArrayListTest {
    public static void main(String[] args) {
        MemberArrayList memberArrayList = new MemberArrayList();
        Member mem1 = new Member(101, "LEE");
        Member mem2= new Member(102, "KIM");
        Member mem3 = new Member(103, "HA");

        memberArrayList.addMember(mem1);
        memberArrayList.addMember(mem2);
        memberArrayList.addMember(mem3);

        memberArrayList.showAll();
        memberArrayList.removeMember(101);
        memberArrayList.showAll();
    }
}
