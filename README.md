# Linux-CommandParser
Simple Java Program to parse Parameters out of a Linux Command

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
