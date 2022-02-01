package collection.hashmap;

import collection.Member;

import java.util.HashMap;

public class MemberHashMapTest {
    public static void main(String[] args) {
        MemberHashMap memberHashMap = new MemberHashMap();

        Member mem1 = new Member(102, "A");
        Member mem2 = new Member(101, "B");
        Member mem3 = new Member(103, "C");

        memberHashMap.addMember(mem1);
        memberHashMap.addMember(mem2);
        memberHashMap.addMember(mem3);

        memberHashMap.removeMember(101);
        memberHashMap.showAllMem();

    }
}
