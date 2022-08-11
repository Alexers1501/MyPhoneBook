public class Main {
    public static void main(String[] args) {
        PhoneBook.addGroups("Work", "Friends", "Family", "Other");

        Contact cont1 = new Contact("Vanya", "79089459834");
        PhoneBook.addGroupsToContact(cont1, "Family");
        Contact cont2 = new Contact("Olya", "79089567576");
        PhoneBook.addGroupsToContact(cont2, "Work", "Friends");
        Contact cont3 = new Contact("Dasha", "79089569432");
        PhoneBook.addGroupsToContact(cont3, "Family", "Favorites");
        Contact cont4 = new Contact("Misha", "79823767576");
        PhoneBook.addGroupsToContact(cont4, "Work", "Friends", "Favorites");
        Contact cont5 = new Contact("Dima", "79089534576");
        PhoneBook.addGroupsToContact(cont5, "Work");

        PhoneBook.print();

        PhoneBook.searchByGroups("Family");
        PhoneBook.searchContactByNumber("79089569432");
        PhoneBook.searchContactByNumber("79083069432");


    }
}
