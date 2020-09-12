import java.util.Scanner;
public class Main {
    public static void main(String [] args){

        ContactsManager myContactsManager = new ContactsManager();
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String [] names;
        names = new String[100];
        int count=0;


        Contact contact1 = new Contact();
        contact1.name = "Adoka";
        contact1.phoneNumber = "0709213599";
        myContactsManager.addContact(contact1);
        names[count] = contact1.name ;
        count++;

        Contact contact2 = new Contact();
        contact2.name = "Ramazan";
        contact2.phoneNumber = "0505211102";
        myContactsManager.addContact(contact2);
        names[count] = contact2.name ;
        count++;


        Contact contact3 = new Contact();
        contact3.name = "Danil";
        contact3.phoneNumber = "0709221122";
        myContactsManager.addContact(contact3);
        names[count] = contact3.name;
        count++;


        int check = 0;
        for (int i=0;i<=count-1;i++){
            if(names[i].equals(name)){
                Contact result = myContactsManager.searchContact(names[i]);
                System.out.println(result.name + ": " + result.phoneNumber);
                check = 1;

            }
        }
        if(check!=1){
            System.out.println("Does not exist!!!");
        }






    }
}