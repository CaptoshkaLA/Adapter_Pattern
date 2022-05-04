public class IncDataExample implements IncomeData{

    @Override
    public String getCountryCode() {
        return "UA";
    }
    @Override
    public String getCompany() {
        return "Netcracker inc";
    }
    @Override
    public String getContactFirstName() {
        return "Nikita";
    }

    @Override
    public String getContactLastName() {
        return "Safonov";
    }

    @Override
    public int getCountryPhoneCode() {
        return 8;
    }

    @Override
    public int getPhoneNumber() {
        return 11;
    }

}
