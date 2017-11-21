import Commands.Implements.*;
import Commands.Invoker;
import Commands.Receiver;
import Models.Network;

import java.util.Scanner;

public class Start {
    public static void main(String[] args)
    {
        Invoker invoker = new Invoker();
        Receiver receiver = new Receiver(new Network());
        Scanner scanner = new Scanner(System.in);
        int menu;
        do{
            System.out.println("Menu");
            System.out.println("1. Registration");
            System.out.println("2. Autorization");
            System.out.println("3. Logout");
            System.out.println("4. Invite friend");
            System.out.println("5. Send public massage");
            System.out.println("6. Send private massage");
            System.out.println("7. Show public massage");
            System.out.println("8. Show private massage");
            System.out.println("9. Show registered users");
            System.out.println("10. Show friend list");
            System.out.print("Enter the menu item: ");
            menu = scanner.nextInt();
            switch(menu)
            {
                case 0:
                    System.out.println("Exit program");
                    break;
                case 1:
                    invoker.setCommand(new Registration(receiver));
                    invoker.run();
                    break;
                case 2:
                    invoker.setCommand(new Autorization(receiver));
                    invoker.run();
                    break;
                case 3:
                    invoker.setCommand(new Logout(receiver));
                    invoker.run();
                    break;
                case 4:
                    invoker.setCommand(new AddFriendList(receiver));
                    invoker.run();
                    break;
                case 5:
                    invoker.setCommand(new SendPublicMassage(receiver));
                    invoker.run();
                    break;
                case 6:
                    invoker.setCommand(new SendPrivateMassage(receiver));
                    invoker.run();
                    break;
                case 7:
                    invoker.setCommand(new ShowPublicMassage(receiver));
                    invoker.run();
                    break;
                case 8:
                    invoker.setCommand(new ShowPrivateMassage(receiver));
                    invoker.run();
                    break;
                case 9:
                    invoker.setCommand(new ShowRegisteredUsers(receiver));
                    invoker.run();
                    break;
                case 10:
                    invoker.setCommand(new ShowFriendList(receiver));
                    invoker.run();
                    break;
                default: break;
            }
        }while(menu!=0);
    }
}
