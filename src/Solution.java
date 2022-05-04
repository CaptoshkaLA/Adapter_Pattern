import java.util.*;

public class Solution {

    public static Map<String, String> countries = new HashMap<String, String>();

    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {
        Contact inc1 = new IncomeDataAdapter(new IncDataExample());
//        System.out.println(inc.getCompanyName());
        System.out.println(inc1.getName());
//        System.out.println(inc.getCountryName());
        System.out.println(inc1.getPhoneNumber());
        Customer inc = new IncomeDataAdapter(new IncDataExample());
        System.out.println(inc.getCompanyName());
        System.out.println(inc.getCountryName());
    }

}
