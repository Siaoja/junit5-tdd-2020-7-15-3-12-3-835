package junit5.tdd;


public class CountOffGame {

    public String play(int number) {
        String result = "";

        if (number % 3 == 0) {
            result += "Fizz";
        }
        if (number % 5 == 0) {
            result += "Buzz";
        }
        if (number % 7 == 0) {
            result += "Whizz";
        }
        if (result.isEmpty()) {
            result = String.valueOf(number);
        }

        return result;
    }
}
