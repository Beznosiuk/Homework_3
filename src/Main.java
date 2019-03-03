import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final int MAXSYMBOL = 13;
        final char SYMBOL = '*';
        final char FILLER = ' ';
        int symbolCount = 1;
        boolean increase = true;
        int number = 0;

        while (number != 6) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number of triangle from 1 to 5:");
            number = scanner.nextInt();

            switch (number) {
                case 1:
                    while (symbolCount > 0) {
                        int counter = 0;
                        while (counter < symbolCount) {
                            System.out.print(SYMBOL);
                            counter++;
                        }

                        System.out.println();
                        if (symbolCount + 2 > MAXSYMBOL) {
                            increase = false;
                        }
                        if (increase) {
                            symbolCount += 2;
                        } else {
                            symbolCount -= 2;
                        }
                    }
                    break;

                case 2:
                    symbolCount = MAXSYMBOL;

                    while (symbolCount > 0) {
                        int fillerCount = (MAXSYMBOL - symbolCount),
                                symbolTmp = symbolCount;

                        while (fillerCount > 0) {
                            System.out.print(FILLER);
                            fillerCount--;
                        }

                        while (symbolTmp > 0) {
                            System.out.print(SYMBOL);
                            symbolTmp--;
                        }

                        symbolCount -= 2;
                        System.out.println();
                    }
                    break;

                case 3:
                    symbolCount = 1;

                    while (symbolCount <= MAXSYMBOL) {
                        int fillerCount = (MAXSYMBOL - symbolCount),
                                symbolTmp = symbolCount;

                        while (fillerCount > 0) {
                            System.out.print(FILLER);
                            fillerCount--;
                        }

                        while (symbolTmp > 0) {
                            System.out.print(SYMBOL);
                            symbolTmp--;
                        }

                        symbolCount += 2;
                        System.out.println();
                    }
                    break;

                case 4:
                    increase = true;
                    symbolCount = 1;

                    while (symbolCount > 0) {
                        int fillerCount = (MAXSYMBOL - symbolCount),
                                symbolTmp = symbolCount;

                        while (fillerCount > 0) {
                            System.out.print(FILLER);
                            fillerCount--;
                        }

                        while (symbolTmp > 0) {
                            System.out.print(SYMBOL);
                            symbolTmp--;
                        }

                        System.out.println();

                        if (symbolCount + 2 > MAXSYMBOL) {
                            increase = false;
                        }
                        if (increase) {
                            symbolCount += 2;
                        } else {
                            symbolCount -= 2;
                        }
                    }
                    break;

                case 5:
                    int repeat = 2;

                    while (repeat > 0) {
                        symbolCount = 1;
                        while (symbolCount <= MAXSYMBOL) {
                            int fillerCount = (MAXSYMBOL - symbolCount) / 2,
                                    symbolTmp = symbolCount;
                            while (fillerCount > 0) {
                                System.out.print(FILLER);
                                fillerCount--;
                            }

                            while (symbolTmp > 0) {
                                System.out.print(SYMBOL);
                                symbolTmp--;
                            }

                            symbolCount += 2;
                            System.out.println();
                        }
                        repeat--;
                    }
                    break;

                default:
                    System.out.println("Invalid number!");
            }
        }
    }
}
