package io.javabrains.reactiveworkshop;

public class Exercise1 {

    public static void main(String[] args) {

        // Use StreamSources.intNumbersStream() and StreamSources.userStream()

        // Print all numbers in the intNumbersStream stream
        // TODO: Write code here
        StreamSources.intNumbersStream().forEach(number -> System.out.println(number));

        // Print numbers from intNumbersStream that are less than 5
        // TODO: Write code here
        StreamSources.intNumbersStream().filter(number -> number < 5).forEach(number -> System.out.println(number));

        // Print the second and third numbers in intNumbersStream that's greater than 5
        // TODO: Write code here
        StreamSources.intNumbersStream().filter(n -> n < 5).limit(3).skip(1).forEach(n -> System.out.println(n));

        //  Print the first number in intNumbersStream that's greater than 5.
        //  If nothing is found, print -1
        // TODO: Write code here
        int gtr5 = StreamSources.intNumbersStream().filter(n -> n > 5).findFirst().orElse(-1);
        System.out.println(gtr5);

        // Print first names of all users in userStream
        // TODO: Write code here
        StreamSources.userStream().forEach(user -> System.out.println(user.getFirstName()));

        // Print first names in userStream for users that have IDs from number stream
        // TODO: Write code here
        StreamSources.userStream().filter(user -> StreamSources.intNumbersStream().anyMatch(n -> n == user.getId())).forEach(user -> System.out.println(user.getFirstName()));
    }

}
