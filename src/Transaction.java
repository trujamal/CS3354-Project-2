import java.io.IOException;

public class Transaction extends ShippingStore {
    /**
     * This constructor is hard-coded to open "<CODE>PackageOrderDB.txt</CODE>" and
     * initialize the <CODE>packageOrerList</CODE> with its contents. If no such file
     * exists, then one is created. The contents of the file are "loaded" into
     * the packageOrerList ArrayList in no particular order. The file is then closed
     * during the duration of the program until <CODE>flush()</CODE> is called.
     *
     * @throws IOException
     */
    public Transaction() throws IOException {
    }
}
