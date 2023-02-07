package day4;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> langs = new ArrayList<>();
//		addinf
		langs.add("java");
		langs.add("Python");
		langs.add("cpp");
		for(String i:langs)System.out.print(i+" ");
//		get from index
		System.out.println('\n'+langs.get(1));
//		set at index
		langs.set(2, "Kotlin");
		for(String i:langs)System.out.print(i+" ");
//		remove/ pop at index
		String str = langs.remove(2);
		System.out.println('\n'+str);
		for(String i:langs)System.out.print(i+" ");
		langs.remove("java");
		System.out.println('\n'+str);
		for(String i:langs)System.out.print(i+" ");
		
//		size() -> returns size
//		sort() -> sorts arraylist
//		clone() -> new arraylist -> shallowcopy

		
		
	}
}
