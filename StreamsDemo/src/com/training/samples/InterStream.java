package com.training.samples;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InterStream {

	public static void main(String[] args) {

		List<String> courses = Arrays.asList("Java", "Httml", "JavaScript", "Css", "Json", "Angular").stream()
				.filter(str -> str.length() > 3).sorted().skip(3).collect(Collectors.toList());
		System.out.println(courses);
		System.out.println();

		List<String> course = Arrays.asList("Java", "Httml", "JavaScript", "Css", "Json", "Angular").stream()
				.filter(str -> str.startsWith("J")).sorted().collect(Collectors.toList());
		System.out.println(course);
		System.out.println();

		Arrays.asList("Java", "Html", "Css").forEach((courseName) -> System.out.println(courseName.toUpperCase()));

		Arrays.asList("Java", "Html", "Css").forEach(System.out::println);
		System.out.println();

		Stream.generate(() -> "Priya").limit(5).forEach((str) -> System.out.println(str.toUpperCase()));

		Arrays.asList("Java", "Httml", "JavaScript", "Css", "Json", "Angular").stream().map((str) -> str.toUpperCase())
				.sorted().limit(4).skip(2).forEach(System.out::println);

		Optional<String> optString = Arrays.asList("Java", "Httml", "JavaScript", "Css", "Json", "Angular").stream()
				.filter((str) -> str.length() < 2)
//						.map((str)->str.toUpperCase())
//						.sorted()
//						.limit(4)
//						.skip(2)
				.findFirst();

		if (optString.isPresent()) {
			String value = optString.get();
			System.out.println(value);
		}

		System.out.println("If present");
		Arrays.asList("Java", "Httml", "JavaScript", "Css", "Json", "Angular").stream().findFirst()
				.filter((str) -> str.length() < 2).ifPresent(System.out::println);

		String course1 = Arrays.asList("Java", "Httml", "JavaScript", "Css", "Json", "Angular").stream()
				.filter((str) -> str.length() < 2).findFirst().orElse("React");
		System.out.println(course1);

		course = Arrays.asList("Java", "Httml", "JavaScript", "Css", "Json", "Angular").stream()
				.filter((str) -> str.length() < 2).findFirst().orElseGet(() -> "react".toUpperCase());
		System.out.println(course);
		System.out.println();

		course = Arrays.asList("Java", "Httml", "JavaScript", "Css", "Json", "Angular").stream()
				.filter((str) -> str.length() < 2).findFirst().orElseGet(() -> "react".toUpperCase());
		System.out.println(course);

		Arrays.asList("Java", "Httml", "JavaScript", "Css", "Json", "Angular").stream()
				.filter((str) -> str.length() < 2).findFirst().orElseThrow(() -> new ArithmeticException());
		System.out.println(course);
	}

}
