package streamapi;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SimpleStream {

    public String removeDuplicateCharacters(String str) {
        return str.chars().distinct().mapToObj(c-> String.valueOf((char)c)).collect(Collectors.joining());
    }
    public int findSecondLargestNumber(List<Integer> numbers) {
        Optional<Integer> res=numbers.stream().sorted(Collections.reverseOrder()).skip(1).findFirst();
        return res.orElse(-1);
    }
    public int findSumOfNumbers(List<Integer> numbers) {
        return numbers.stream().reduce(0,Integer::sum);
    }

    public String findFirstMatch(List<String> words, String pattern) {
        return words.stream().filter(word-> word.contains(pattern)).findFirst().orElse(null);
    }

    public List<String> findAllMatches(List<String> words, String pattern) {
        return words.stream().filter(word-> word.contains(pattern)).collect(Collectors.toList());
    }

    public Long findCountOfEvenNumbers(List<Integer> numbers) {
        return numbers.stream().filter(num->num%2==0).count();
    }

    public Map<Character, List<String>> findAllGroupedWordsByFirstLetter(List<String> words) {
        return words.stream().collect(Collectors.groupingBy(word->word.charAt(0)));
    }

    public Map<Character, Long> countAllCharsInStrings(String word) {
        return word.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
    }


    public Map<Boolean,List<Integer>> partitionNumberEvenOrOdd(List<Integer> numbers) {
        return numbers.stream().collect(Collectors.partitioningBy(num->num%2==0));
    }

    public Map<Integer,List<String>> sortWordsByLengthAndAlphabatically(List<String> words) {
        return words.stream().sorted(String::compareTo).collect(Collectors.groupingBy(String::length));
    }

    public int findMax(List<Integer> numbers) {
        return numbers.stream().max(Comparator.comparing(i->(int)i)).get();
    }


    public static void main(String[] args) {
        SimpleStream simpleStream = new SimpleStream();

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        System.out.println(simpleStream.findSumOfNumbers(numbers));

        System.out.println(simpleStream.findSecondLargestNumber(numbers));

        System.out.println(simpleStream.findCountOfEvenNumbers(numbers));

        System.out.println(simpleStream.partitionNumberEvenOrOdd(numbers));


        System.out.println(simpleStream.findMax(numbers)+":max");
        System.out.println(simpleStream.findMax(List.of(0,0,19,-19))+":max");



        List<String> words=Arrays.asList("apple","app","apple","Bandit","apple","apple","apple", "banana", "ban","cat");

        System.out.println(simpleStream.findFirstMatch(words,"an"));

        System.out.println(simpleStream.findAllMatches(words,"app"));
        System.out.println(simpleStream.findAllMatches(words,"an"));

        System.out.println(simpleStream.findAllGroupedWordsByFirstLetter(words));

        System.out.println(simpleStream.removeDuplicateCharacters("applee"));

        System.out.println(simpleStream.countAllCharsInStrings("I love how I could have been loved"));

        System.out.println(simpleStream.sortWordsByLengthAndAlphabatically(words));
    }


}
