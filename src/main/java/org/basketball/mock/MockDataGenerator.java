package org.basketball.mock;

import org.basketball.domain.Court;
import org.basketball.domain.Game;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


@Component
public class MockDataGenerator {

    private List<String> adjectives = Stream.of("Big", "Fat", "Huge", "Silly", "Cursed", "Fucked", "Closed").collect(Collectors.toList());
    private List<String> nouns = Stream.of("Dog", "Cat", "Fish", "Ball", "Momma", "Cousin", "Pirate").collect(Collectors.toList());
    private List<Integer> littleInts = IntStream.rangeClosed(1, 6).mapToObj(i -> i).collect(Collectors.toList());
    private List<Integer> oneOrTwo = Arrays.asList(1, 2);

    public void generateMockData() {

    }

    public Court generateNewCourt() {
        Court court = new Court();
        court.setId(UUID.randomUUID());
        court.setName(getRandomElement(adjectives) + " " + getRandomElement(nouns));
        court.setHoops(getRandomElement(littleInts));
        court.setDescription(generateLongText());
        court.setCreatedAt(LocalDateTime.now());
        return court;
    }

    private Game generateGame(Court court) {
        Game game = new Game();
        game.setId(UUID.randomUUID());
        game.setCourt(court);
        court.getGames().add(game);
        game.setHoops(getRandomElement(oneOrTwo));
        game.setName(getRandomElement(nouns));
        return game;
    }

    public List<Court> generateCourts(int soMuch) {
        return IntStream.range(0, soMuch).mapToObj(i -> generateNewCourt()).collect(Collectors.toList());
    }

    private String generateLongText() {
        return "Long text is long";
        //todo: read from file or smth
    }

    private <T> T getRandomElement(List<T> list) {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }

}
