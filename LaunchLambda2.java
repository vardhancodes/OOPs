interface FI{
    int lengthOfWord(String str);
}
class FIimpl implements FI{
    public int lengthOfWord(String str)
    {
        return str.length();
    }
}
public class LaunchLambda2 {
    public static void main(String[] args) {
        FI s = new FIimpl();
        System.out.println(s.lengthOfWord("NAMAN"));
        FI s1 = new FI() {
            public int lengthOfWord(String str)
            {
                return str.length();
            }
        };
        System.out.println(s1.lengthOfWord("NAMAN"));

        FI s2 = (str) -> {
            return str.length();
        };
        System.out.println(s2.lengthOfWord("NAMAN"));
    }
}
