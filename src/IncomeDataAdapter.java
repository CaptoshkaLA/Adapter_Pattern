public class IncomeDataAdapter implements Customer, Contact {
    private IncomeData incData;

    public IncomeDataAdapter(IncomeData incData) {
        this.incData = incData;
    }

    @Override
    public String getName() {
        return incData.getContactFirstName() + " " + incData.getContactLastName();
    }

    @Override
    public String getCompanyName() {
        return incData.getCompany();
    }

    @Override
    public String getCountryName() {
        return Solution.countries.get(incData.getCountryCode());
    }

    @Override
    public String getPhoneNumber() {
        String s = String.valueOf(incData.getPhoneNumber());
        String phoneNumber = "";
        while (s.length() < 10){
            s = "0"+s;
        }
        phoneNumber = "+" + incData.getCountryPhoneCode() + "("+ s.substring(0,3) + ")" + s.substring(3,6) + "-" + s.substring(6,8) + "-" + s.substring(8,10);
        return phoneNumber;
    }
}
