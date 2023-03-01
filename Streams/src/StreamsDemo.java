import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {

	public static void main(String[] args) {
		List<String> list = List.of("Alok", "Abhishek", "Deepak", "Digyvijay","Amit");
		
		//filter
		List<String> l =list.stream().filter(s->s.length()>4).collect(Collectors.toList());
		System.out.println(l);
		
		Long count= list.stream().filter(str ->str.length()==4).count();
		System.out.println(count);
		
		List<String> l2=list.stream().map(str->str.toUpperCase()).collect(Collectors.toList());
		System.out.println(l2);
		
		//sorted without arg
		List<String> l3 =list.stream().sorted().collect(Collectors.toList());
		System.out.println(l3);
		
		//sorted with args
		List<String> l4 =list.stream().sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList());
		System.out.println(l4);
		
		//min value
		String min= list.stream().min((s1,s2)-> s1.compareTo(s2)).get();
		System.out.println(min);
		
		//max value
		String max= list.stream().max((s1,s2)-> s1.compareTo(s2)).get();
		System.out.println(max);
		
		//for each
		list.stream().forEach(s-> System.out.print(s+" "));
		System.out.println();
		
		//forEach with method Ref
		list.stream().forEach(System.out::println);
		System.out.println(); 
		
		//toArray
		String[] arr = list.stream().toArray(String[] :: new);
		for(String s : arr) {
			System.out.print(s+" ");
		}
		System.out.println();
		
		//streams to group of elements
		Stream<Integer> stream = Stream.of(2,22,222,2222,22222);
		stream.forEach(System.out::println);
		
		 //stream for array
		 Integer[] iarr = {1,2,3,4,5,6};
		 Stream<Integer> istr = Stream.of(iarr);
		 istr.forEach(System.out::println);
	}	

}
