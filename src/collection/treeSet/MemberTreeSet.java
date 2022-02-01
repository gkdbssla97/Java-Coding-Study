package collection.treeSet;

import collection.Member;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
    private TreeSet<Member> memtree;

    public MemberTreeSet() {
        memtree = new TreeSet<Member>(new Member());
    }
    public void addMember(Member mem) {
        memtree.add(mem);
    }
    public boolean removeMember(int MemID) {
        Iterator<Member> iterator = memtree.iterator();
        while (iterator.hasNext()) {
            Member A = iterator.next();
            if(A.getMemberId() == MemID) {
                memtree.remove(A);
                return true;
            }
        }
        System.out.println(MemID + "가 없습니다.");
        return false;
    }
    public void showAll() {
        for(Member m: memtree)
            System.out.println(m);
        System.out.println();
    }
}
