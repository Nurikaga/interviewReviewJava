package AbstractionInheritance;

public class TestBank {
    public static void main(String[] args) {
        HDFCBank hb = new HDFCBank();
hb.loan();
hb.debit();
hb.credit();

Bank b = new HDFCBank();
b.loan();
        b.credit();
        b.debit();
    }
}
