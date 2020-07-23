package junit5.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
 * 测试用例1：
 * input: 1, output: 1;
 * 测试用例2:
 * input: 3, output: Fizz
 * 测试用例3:
 * input: 5, output: Buzz
 * 测试用例4:
 * input 7, output: Whizz
 * 测试用例5:
 * input: 15, output: FizzBuzz
 * 测试用例6:
 * input: 21, output: FizzWhizz
 * 测试用例7:
 * input: 35, output: BuzzWhizz
 * 测试用例8:
 * input: 105, output: FizzBuzzWhizz
 *
 * [Junit-TDD-practice][spike lu] feature: implement given 1 when count off game play then return 1.
 * "[Junit-TDD-practice][spike lu] feature: add should_given_1_when_play_count_off_game_then_return_1 test"
 * */
public class CountOffGameTest {
    @Test
    void should_given_1_when_play_count_off_game_then_return_1() {
//        given
        int number = 1;

//        when
        CountOffGame countOffGame = new CountOffGame();
        String actual = countOffGame.play(number);

//        then
        Assertions.assertEquals("1", actual);
    }

    @Test
    void should_given_3_when_play_count_off_game_then_return_Fizz() {
//        given
        int number = 3;

//        when
        CountOffGame countOffGame = new CountOffGame();
        String actual = countOffGame.play(number);

//        then
        Assertions.assertEquals("Fizz", actual);
    }

    @Test
    void should_given_5_when_play_count_off_game_then_return_Buzz() {
//        given
        int number = 5;

//        when
        CountOffGame countOffGame = new CountOffGame();
        String actual = countOffGame.play(number);

//        then
        Assertions.assertEquals("Buzz", actual);
    }

    @Test
    void should_given_7_when_play_count_off_game_then_return_Whizz() {
//        given
        int number = 7;

//        when
        CountOffGame countOffGame = new CountOffGame();
        String actual = countOffGame.play(number);

//        then
        Assertions.assertEquals("Whizz", actual);
    }

    @Test
    void should_given_15_when_play_count_off_game_then_return_FizzBuzz() {
//        given
        int number = 15;

//        when
        CountOffGame countOffGame = new CountOffGame();
        String actual = countOffGame.play(number);

//        then
        Assertions.assertEquals("FizzBuzz", actual);
    }

    @Test
    void should_given_35_when_play_count_off_game_then_return_BuzzWhizz() {
//        given
        int number = 35;

//        when
        CountOffGame countOffGame = new CountOffGame();
        String actual = countOffGame.play(number);

//        then
        Assertions.assertEquals("BuzzWhizz", actual);
    }

    @Test
    void should_given_105_when_play_count_off_game_then_return_FizzBuzzWhizz() {
//        given
        int number = 105;

//        when
        CountOffGame countOffGame = new CountOffGame();
        String actual = countOffGame.play(number);

//        then
        Assertions.assertEquals("FizzBuzzWhizz", actual);
    }
}
