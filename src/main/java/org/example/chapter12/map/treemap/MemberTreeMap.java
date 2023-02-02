package org.example.chapter12.map.treemap;

import java.util.Iterator;
import java.util.TreeMap;

import org.example.chapter12.collection.Member;

public class MemberTreeMap {
    private TreeMap<Integer, Member> treeMap;

    public MemberTreeMap(){
        treeMap = new TreeMap<Integer, Member>();
    }

    public void addMember(Member member){
        treeMap.put(member.getMemberId(), member); //key-value pair
    }

    public boolean removeMember(int memberId){
        if(treeMap.containsKey(memberId)){
            treeMap.remove(memberId); //key 값에 맞는 자료 삭제
            return true;
        }
        System.out.println(memberId + "가 존재하지 않습니다");
        return false;
    }

    public void showAllMember(){
        Iterator<Integer> ir = treeMap.keySet().iterator();
        while(ir.hasNext()){
            int key = ir.next();
            Member member = treeMap.get(key); // key에 해당하는 value
            System.out.println(member);
        }
        System.out.println(  );
    }
}
