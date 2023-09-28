import java.util.*;

// test comment to see if editing online reflects local version

// test comment to see if new branch worked

public class AddressBook {

    private ArrayList<BuddyInfo> myBuddies;

    public AddressBook() {
        myBuddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo myBuddy) {
        myBuddies.add(myBuddy);
    }

    public void removeBuddy(BuddyInfo myBuddy) {
        myBuddies.remove(myBuddy);
    }

    BuddyInfo buddy1 = new BuddyInfo("Homer", "123 Any Street", "(123)123-1234");
    BuddyInfo buddy2 = new BuddyInfo("John", "123 Any Street", "(135)135-1357");
    BuddyInfo buddy3 = new BuddyInfo("Emily", "125 Any Street", "(147)147-1470");

    public BuddyInfo addBuddy(String newBuddyName, String newBuddyAddress, String newBuddyPhoneNumber){
        return new BuddyInfo(newBuddyName, newBuddyAddress, newBuddyPhoneNumber);
    }

    public void removeBuddy(){}

    public static void main(String[] args) {
        BuddyInfo newBuddy = new BuddyInfo("Tom", "Carlton", "(123)123-1234");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(newBuddy);
        addressBook.removeBuddy(newBuddy);
    }


}
