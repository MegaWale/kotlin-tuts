package SinkDotComGame;

public class SimpleDotComTestDrive {

    public static void main ( String [] args ) {

        SimpleDotCome dot = new SimpleDotCome();

        int[] location = {2,3,4};

        dot.setLocationCells(location);

        String userGuess = "2";

        String result = dot.checkYourself(userGuess);

        String testResult = "failed";

        if (result.equals("hit")) {
            testResult = "passed";
        }

        System.out.println(testResult);
    }
}
