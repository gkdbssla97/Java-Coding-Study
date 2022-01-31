package collection.HashSet;

import collection.Member;
import collection.arraylist.MemberArrayList;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
    private HashSet<Member> memhash;

    public MemberHashSet() {
        memhash = new HashSet<Member>();
    }
    public void addMember(Member mem) {
        memhash.add(mem);
    }
    public boolean removeMember(int MemID) {
        Iterator<Member> iterator = memhash.iterator();
        while (iterator.hasNext()) {
            Member A = iterator.next();
            if(A.getMemberId() == MemID) {
                memhash.remove(A);
                return true;
            }
        }
        System.out.println(MemID + "가 없습니다.");
        return false;
    }
    public void showAll() {
        for(Member m: memhash)
            System.out.println(m);
        System.out.println();
    }
}
