package Collection_pack;

import java.util.ArrayList;

public class NumberList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println("List "+list);
		list.add(1, 15);
		System.out.println("Newly added list "+list);
		list.addFirst(5);
		System.out.println(list);
		list.add(20);
		System.out.println("Duplicates"+list);
		System.out.println("get "+list.get(1));

	}

}
