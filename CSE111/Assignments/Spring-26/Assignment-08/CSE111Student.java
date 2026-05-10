public class CSE111Student extends Student {
    public String msg;

    public CSE111Student() {
        this.msg = "I love Java Programming";
    }

    public String shout() {
        return this.msg;
    }
}