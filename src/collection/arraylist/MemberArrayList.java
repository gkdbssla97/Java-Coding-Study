package collection.arraylist;

import collection.Member;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
    private ArrayList<Member> arrayList;

    public MemberArrayList() {
        arrayList = new ArrayList<Member>();
    }
    public void addMember(Member mem) {
        arrayList.add(mem);
    }
    public boolean removeMember(int memberId) {
        /*or (int i = 0; i < arrayList.size(); i++) {
            Member member = arrayList.get(i);
            if (member.getMemberId() == memberId) {
                arrayList.remove(i);
                return true;
            }
        }*/
        Iterator<Member>iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Member member = iterator.next();
            if (member.getMemberId() == memberId) {
                arrayList.remove(member);
                return true;
            }
        }
        System.out.println(memberId + "가 존재 X");
        return false;
    }
    public void showAll() {
        for(Member b: arrayList) {
            System.out.println(b);
        }
        System.out.println(arrayList);
    }
}
