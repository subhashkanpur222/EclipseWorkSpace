package Javaconcept;

import java.util.stream.IntStream;

public class StreamsApiDemo {

	public static void main(String[] args) {
		int numbers[] = {4,1,13,90,16,2,0};
		System.out.println(IntStream.of(numbers).min());

	}

}
