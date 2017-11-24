import Commands.Implements.*;
import Commands.Invoker;
import Commands.Receiver;
import Models.Network;

import java.util.Scanner;

public class Start {
    public static void main(String[] args){
        Invoker invoker = new Invoker();
        Receiver receiver = new Receiver(new Network());
        Scanner scanner = new Scanner(System.in);
        int menu, menuNW;
        do{
            System.out.println("Menu");
            System.out.println("0. Exit social network");
            System.out.println("1. Registration");
            System.out.println("2. Authorization");
            System.out.print("Select menu item: ");
            menu = scanner.nextInt();
            switch(menu){
                case 0: break;
                case 1:
                    invoker.setCommand(new Registration(receiver));
                    invoker.run();
                    break;
                case 2:
                    invoker.setCommand(new Authorization(receiver));
                    invoker.run();
                    if(receiver.getNetwork().getCurrentUser()!=null) {
                        do {
                            System.out.println("Menu Social Network");
                            System.out.println("0. Logout");
                            System.out.println("1. Show user list");
                            System.out.println("2. Add friend");
                            System.out.println("3. Show my friends");
                            System.out.println("4. Send public massage");
                            System.out.println("5. Show public massage");
                            System.out.println("6. Send private massage");
                            System.out.println("7. Show private massage");
                            menuNW = scanner.nextInt();
                            switch (menuNW) {
                                case 0:
                                    invoker.setCommand(new Logout(receiver));
                                    invoker.run();
                                    break;
                                case 1:
                                    invoker.setCommand(new ShowUserList(receiver));
                                    invoker.run();
                                    break;
                                case 2:
                                    invoker.setCommand(new AddFriend(receiver));
                                    invoker.run();
                                    break;
                                case 3:
                                    invoker.setCommand(new ShowFriends(receiver));
                                    invoker.run();
                                    break;
                                case 4:
                                    invoker.setCommand(new SendPublicMassage(receiver));
                                    invoker.run();
                                    break;
                                case 5:
                                    invoker.setCommand(new ShowPublicMassage(receiver));
                                    invoker.run();
                                    break;
                                case 6:
                                    invoker.setCommand(new SendPrivateMassage(receiver));
                                    invoker.run();
                                    break;
                                case 7:
                                    invoker.setCommand(new ShowPrivateMassage(receiver));
                                    invoker.run();
                                    break;
                                default:
                                    break;
                            }
                        } while (menuNW != 0);
                    }
                    break;
                default:
                    System.out.println("Item menu exist");
                    break;
            }
        }while(menu!=0);

    }
}
