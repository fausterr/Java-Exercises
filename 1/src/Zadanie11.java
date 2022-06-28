import java.util.Collection;

public class Zadanie11 {
    /*
    Has it ever bothered you when unknown people call you and try to impose their services?
    That can be annoying.
    Let's try to solve the problem by using a blacklist.
    You should implement the filterPhones method that returns only the phone numbers that are not on the blacklist.
     */

    public static Collection<String> filterPhones(Collection<String> phones,
                                                  Collection<String> blacklist) {
        phones.removeIf(phone -> blacklist.contains(phone));
        return phones;
    }


    public static void main(String[] args) {

    }
}
