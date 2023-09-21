public class AddressBook {

    BuddyInfo buddy1 = new BuddyInfo("Homer", "123 Any Street", "(123)123-1234");
    BuddyInfo buddy2 = new BuddyInfo("John", "123 Any Street", "(135)135-1357");
    BuddyInfo buddy3 = new BuddyInfo("Emily", "125 Any Street", "(147)147-1470");

    public BuddyInfo addBuddy(String newBuddyName, String newBuddyAddress, String newBuddyPhoneNumber){
        return new BuddyInfo(newBuddyName, newBuddyAddress, newBuddyPhoneNumber);
    }

    public void removeBuddy(){}

    public static void main(String[] args) {
        System.out.println("Address Book");
    }

}
