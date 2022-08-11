import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneBook {

    public static HashMap<String, List<Contact>> book = new HashMap<>();

    public static void addGroups(String... groups){
        for (String groupName : groups)
            book.put(groupName, new ArrayList<>());
        System.out.println("Группы созданы!\n");
    }

    public static void addGroupsToContact(Contact contact, String... groups){
        for (String groupName : groups){
            if (book.containsKey(groupName))
                book.get(groupName).add(contact);
            else{
                List<Contact> list = new ArrayList<>();
                list.add(contact);
                book.put(groupName, list);
            }
        }
    }

    public static void searchByGroups(String group){
        System.out.printf("Поиск по группе \"%s\"... \n", group);
        if (book.containsKey(group)) {
            for (Contact contact : book.get(group))
                System.out.printf("%s \n", contact.toString());
            System.out.println();
        }
        else
            System.out.println("Такой группы не существует\n");
    }

    public static void searchContactByNumber(String phone){
        System.out.printf("Поиск по номеру \"%s\"... \n", phone);
        boolean f = false;
        for (String key : book.keySet()){
            for (Contact contact : book.get(key))
                if (contact.phone.equals(phone)){
                    System.out.println(contact + "\n");
                    f = true;
                    break;
                }
            if (f) break;
        }
        if (!f) System.out.println("Контакта по такому номеру телефона не существует\n");
    }

    public static void print(){
        for (String key : book.keySet()){
            System.out.printf("Группа \"%s\" : ", key);
            for (Contact contact : book.get(key))
                System.out.printf("\n\t\t %s", contact.toString());
            System.out.println();
        }
        System.out.println();
    }
}
