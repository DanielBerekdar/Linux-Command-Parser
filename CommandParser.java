import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
    The CommandParser function will take in a linux command and filter their parameters and add them to an ArrayList.
    Example input: /this/is/a/command -f fruit -a dog -d "this is a description" -l maine
    Example output:
                    ArrayList<String>
                    [
                        A0: /this/is/a/command,
                        A1: -f,
                        A2: fruit,
                        A3: -a,
                        A4: dog,
                        A5: -d,
                        A6: this is a description,
                        A7: -l,
                        A8: maine
                    ]

 */
public class CommandParser {
    public static ArrayList<String> ParseCommand(String command) {
        ArrayList<String> commandList = new ArrayList<String>();
        int length = command.length();
        Pattern regex = Pattern.compile("[^\\s\"']+|\"([^\"]*)\"|'([^']*)'");
        Matcher matcher = regex.matcher(command);

        int i = 0;
        while (matcher.find()) {
            if (matcher.group(1) != null) {
                commandList.add("A" + i + ": " + matcher.group(1));
            } else if (matcher.group(2) != null) {
                commandList.add("A" + i + ": " + matcher.group(2));
            } else {
                commandList.add("A" + i + ": " + matcher.group());
            }
            i++;
        }
        return commandList;
    }
}
