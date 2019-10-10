public class TwoIfs {

    public int doSomething(boolean a, boolean b) {

        int result = 0;
        if (a) {
            result += 1;
        } else {
            result -= 1;
        }

        if (b) {
            result += 2;
        } else {
            result -= 2;
        }

        return result;
    }
}
