import java.util.ArrayList;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class test1 {

	@Test
	public void regular() {
		// TODO Auto-generated method stub
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		int count = 0;
		
		for(int i=0; i<names.size(); i++) {
			String actual = names.get(i);
			if(actual.startsWith("A")) {
				count++;
			}
		}

		System.out.println(count);
	}
	
	@Test
	public void streamFilter() {
		//Stream.of("Abhijeet", "Ram").filter(s->s.startsWith("A")).count();
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		//Lambda Expression
		Long c = names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
	}

	@Test
	public void streamMap() {
		Stream.of("Abhijeet","Abhirama","Nikhil","Rajeev","Akeera").filter(s->s.endsWith("a"))
		.map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	}

}
