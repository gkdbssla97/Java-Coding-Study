package collection.hashmap;

import collection.Member;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
    private HashMap<Integer, Member> hashMap;

    public MemberHashMap() {
        hashMap = new HashMap<Integer, Member>();
    }
    public void addMember(Member mem) {
        hashMap.put(mem.getMemberId(), mem);
    }
    public boolean removeMember(int memberId) {
        if (hashMap.containsKey(memberId)) {
            hashMap.remove(memberId);
            return true;
        }
        return false;
    }
    public void showAllMem() {
        Iterator<Integer> ir = hashMap.keySet().iterator();
        while (ir.hasNext()) {
            int key = ir.next();
            Member mem = hashMap.get(key);
            System.out.println(mem);
        }
    }
}
