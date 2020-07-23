package junit5.tdd;

import javafx.scene.media.AudioClip;
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
* input: 105, output: FizzBuzzWhizz
* */
public class CountOffGameTest {
    @Test
    void should_given_1_when_play_count_off_game_then_return_1() {
//        given
        int number = 1;

//        when
        CountOffGame countOffGame = new CountOffGame();
        String actual = CountOffGame.play(number);

//        then
        Assertions.assertEquals("1",actual);
    }
}