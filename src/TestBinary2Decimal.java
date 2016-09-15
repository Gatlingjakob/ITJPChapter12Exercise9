/**
 * Created by Jakob on 15-09-2016.
 */

import java.util.*;

public class TestBinary2Decimal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a binary: ");
        try {
            System.out.println(ITJPchapter12exercise9.bin2Dec(input.nextLine()));
        }
        catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
