package ×Ô¼º±àÐ´;

import java.util.*;


class Age implements Comparable{
	private int year;
	public Age(int year){
		this.year=year;
	}
	public int getAge(){
		return this.year;
	}
	public int compareTo(Object o){
		int i=((Age) o).year;
		if(year<i){
			return -1;
		}else if(year==i){
			return 0;
		}else{
			return 1;
		}
	}
}
public class UtilInterfaceTest {
	
	public static void printList(List<Age> list){
		Iterator<Age> it=list.iterator();
		while(it.hasNext()){
			Age age=(Age)it.next();
			System.out.println(age.getAge());
		}
	}
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Age> list=new LinkedList<Age>();
		list.add(new Age(25));
		list.add(new Age(28));
		list.add(new Age(27));
		System.out.println("-----before");
		printList(list);
		Collections.sort(list);
		System.out.println("-----after");
		printList(list);
		System.out.println("-----compare");
		Age a1=new Age(29);
		System.out.println(a1.compareTo(new Age(30)));
		System.out.println(a1.compareTo(new Age(28)));
		System.out.println(a1.compareTo(new Age(29)));
	}

}
