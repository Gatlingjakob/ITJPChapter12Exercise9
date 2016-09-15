/**
 * Created by Jakob on 15-09-2016.
 */
public class BinaryFormatException extends NumberFormatException {

    private String binaryString;

    public BinaryFormatException(String binaryString) {
        super(binaryString + " is not a binary string");
        this.binaryString = binaryString;
    }


    public String getBinaryString() {
        return binaryString;
    }
}
