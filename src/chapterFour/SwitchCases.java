package chapterFour;



import java.util.Scanner;

public class SwitchCases {
    public static void main(String[] args) {
        String prompt = """
                1. Phone Book
                2. Messages
                3.Chat
                4.Call Register
                5.  Tones
                6. Settings
                7. Call Divert
                8. Games
                9. Calculator
                10. Reminders
                11. Clock
                12. Profiles
                13. SIM services
                """;
        System.out.println(prompt);
        Scanner scan = new Scanner(System.in);
        int userchoice = scan.nextInt();
        switch (userchoice){
            case 1 :
                System.out.println("Phone Book");
                 String phonebook = """
                         1. Search
                         2. Services Nos
                         3. Add Name
                         4. Erase
                         5. Edit
                         6. Assign Tone
                         7. Send b'card
                         8. Options
                         9. Speed dials
                         10. Voice Tags
                         """;
                System.out.println(phonebook);
                int phone  = scan.nextInt();
                switch (phone) {
                    case 1 -> System.out.println("Search");
                    case 2 -> System.out.println("Service Nos");
                    case 3 -> System.out.println("Add Name");
                    case 4 -> System.out.println("Erase");
                    case 5 -> System.out.println("Edit");
                    case 6 -> System.out.println("Assign Tones");
                    case 7 -> System.out.println("Send Business card");
                    case 8 -> {
                        System.out.println("Options");
                        String optionprompt = """
                                1. Type of view
                                2. Memory Status
                                """;
                        System.out.println(optionprompt);
                        int optionprompting = scan.nextInt();
                        switch (optionprompting) {
                            case 1 -> System.out.println("Type of View");
                            case 2 -> System.out.println("Memory Status");
                            default -> System.out.println("Enter the right choice");
                        }
                    }
                    case 9 -> System.out.println("Speed Dials");
                    case 10 -> System.out.println("Voice Tags");
                    default -> System.out.println("Type in the rignt number");
                }
           break;
            case 2:
                System.out.println("Messages ");
                String messages = """
                         1. Write Messages
                         2. Inbox
                         3.Outbox
                         4. Picture Messages
                         5. Templates
                         6. Smileys
                         7. Messages Settings
                         8. Info Settings
                         9. Voice Mailbox number
                         10. Service Command Editor
                         """;
                System.out.println(messages);
                int userchoices = scan.nextInt();
                switch (userchoices) {
                    case 1 -> System.out.println("Write Messages");
                    case 2 -> System.out.println("Inbox");
                    case 3 -> System.out.println("Outbox");
                    case 4 -> System.out.println("Picture Messages");
                    case 5 -> System.out.println("Templates");
                    case 6 -> System.out.println("Smileys");
                    case 7 -> {
                        System.out.println("Messages Settings");
                        String messagessettings = """
                                1. Set
                                2. Common
                                """;
                        System.out.println(messagessettings);
                        int messagessettingschoices = scan.nextInt();
                        switch (messagessettingschoices) {
                            case 1 -> {
                                System.out.println("Set");
                                String settingprompt = """
                                        1. Message Center Number
                                        2. Message sent as
                                        3. Message Validity
                                        """;
                                System.out.println(settingprompt);
                                int settingprompts = scan.nextInt();
                                switch (settingprompts) {
                                    case 1 -> System.out.println("Message Center Number");
                                    case 2 -> System.out.println("Message Sent As");
                                    case 3 -> System.out.println("Message Validity");
                                    default -> System.out.println("Choice Not Available");
                                }
                            }
                            case 2 -> {
                                System.out.println("Common");
                                String commandprompt = """
                                        1. Delivery Report
                                        2. Reply via same centre
                                        3. Character Support
                                        """;
                                System.out.println(commandprompt);
                                int commandprompts = scan.nextInt();
                                switch (commandprompts) {
                                    case 1 -> System.out.println("Delivery Report");
                                    case 2 -> System.out.println("Reply Via Same Center");
                                    case 3 -> System.out.println("Character Support");
                                    default -> System.out.println("Choice Not Available");
                                }
                            }
                        }
                    }
                    case 8 -> System.out.println("Info Services");
                    case 9 -> System.out.println("Voice Mailbox Services");
                    case 10 -> System.out.println("Service Command Editor");
                    default -> System.out.println("Enter The Right Choice");
                }
                break;
            case 3:
                System.out.println("Chat");
                break;
            case 4:
                System.out.println("Call Register");
                String callprompt = """
                        1. Missed Call
                        2. Received Call
                        3. Dialled Numbers
                        4. Erase Recent Call list
                        5. Show Call Duration
                        6. Show Call Cost
                        7. Call cost setting
                        8. Prepaid Credit
                        """;
                System.out.println(callprompt);
                int callprompts = scan.nextInt();
                switch (callprompts) {
                    case 1 -> System.out.println("Missed Call");
                    case 2 -> System.out.println("Received Call");
                    case 3 -> System.out.println("Dialled Numbers");
                    case 4 -> System.out.println("Erase Recent Call List");
                    case 5 -> {
                        System.out.println("Show Call Duration");
                        String callduration = """
                                1.Last Call Duration
                                2. All Calls Duration
                                3. Received Calls' Duration
                                4. Dialled Calls' Duration
                                5. Clear Timers
                                """;
                        System.out.println(callduration);
                        int calldurationprompt = scan.nextInt();
                        switch (calldurationprompt) {
                            case 1 -> System.out.println("Last Call Duration");
                            case 2 -> System.out.println("All Call Duration");
                            case 3 -> System.out.println("Received Call Duration");
                            case 4 -> System.out.println("Dialled Calls' Duration");
                            case 5 -> System.out.println("Clear Timers");
                            default -> System.out.println("Enter the right choice");
                        }
                    }
                    case 6 -> {
                        System.out.println("Show Call Costs");
                        String callcost = """
                                1. Last Call Cost
                                2. All Call's Cost
                                3. Clear Counter
                                """;
                        System.out.println(callcost);
                        int callcostprompt = scan.nextInt();
                        switch (callcostprompt) {
                            case 1 -> System.out.println("Last Call Cost");
                            case 2 -> System.out.println("All Call's Cost");
                            case 3 -> System.out.println("Clear Counter");
                            default -> System.out.println("Enter Right Choice");
                        }
                    }
                    case 7 -> {
                        System.out.println("Call Cost Settings");
                        String lastCallCost = """
                                1. Call Cost Limit
                                2. Show Costs in
                                """;
                        System.out.println(lastCallCost);
                        int costprompt = scan.nextInt();
                        switch (costprompt) {
                            case 1 -> System.out.println("Call Cost Limit");
                            case 2 -> System.out.println("Show Costs in");
                            default -> System.out.println("Enter Right Choice");
                        }
                    }
                    case 8 -> System.out.println("Prepaid Credit");
                }
                break;
            case 5:
                System.out.println("Tones");
                String tones = """
                        1. Ringing Tones
                        2. Ringing Volumes
                        3. Incoming Call Alert
                        4. Composer
                        5. Message Alert Tones
                        6. Keypad Tones
                        7.  Warning and Game Tones
                        8. Vibrating Alert
                        9. Screen Saver
                        """;
                System.out.println(tones);
                int tonesprompt = scan.nextInt();
                switch (tonesprompt){
                    case 1 -> System.out.println("Ringing Tones");
                    case 2-> System.out.println("Ringing volumes");
                    case 3-> System.out.println("Incoming call alert");
                    case 4-> System.out.println("Composer");
                    case 5 -> System.out.println("Message Alert Tones");
                    case 6 -> System.out.println("Keypad Tones");
                    case 7 -> System.out.println("Warning And Game Tones");
                    case 8 -> System.out.println("Vibrating Alert");
                    case 9 -> System.out.println("Screen saver");
                    default -> System.out.println("Enter right choice");
                }
                break;
            case 6:
                System.out.println("Settings");
                String settingsprompt = """
                        1. Call Settings
                        2.Phone Settings
                        3. Security Settings
                        4. Restore Factory Settings
                        """;
                System.out.println(settingsprompt);
                int callsettings = scan.nextInt();
                switch (callsettings) {
                    case 1 -> {
                        System.out.println("Call Settings");
                        String callsettingprompt = """
                                1. Automatic Redial
                                2. Speed Dialling
                                3.Call Waiting Options
                                4. Own number sending
                                5.Phone line In Use
                                6.Automatic answer
                                """;
                        System.out.println(callsettingprompt);
                        int callsettinging = scan.nextInt();
                        switch (callsettinging) {
                            case 1 -> System.out.println("Automatic Redial");
                            case 2 -> System.out.println("Speed Dialling");
                            case 3 -> System.out.println("Call Waiting Options");
                            case 4 -> System.out.println("Own Number Sending");
                            case 5 -> System.out.println("Phone line in use");
                            case 6 -> System.out.println("Automatic Answer");
                            default -> System.out.println("Enter the right choice");
                        }
                    }
                    case 2 -> {
                        System.out.println("Phone Settings");
                        String phonesetting = """
                                1.Language
                                2. Cell Info Display
                                3. Welcome note
                                4. Network Selection
                                5. Lights
                                6. Confirm SIM service actions
                                """;
                        System.out.println(phonesetting);
                        int phonesettings = scan.nextInt();
                        switch (phonesettings) {
                            case 1 -> System.out.println("Language");
                            case 2 -> System.out.println("Cell Info Display");
                            case 3 -> System.out.println("Welcome Note");
                            case 4 -> System.out.println("Network Selection");
                            case 5 -> System.out.println("Lights");
                            case 6 -> System.out.println("Confirm SIM service actions");
                            default -> System.out.println("Enter the right choice");
                        }
                    }
                    case 3 -> {
                        System.out.println("Security Settings");
                        String securitysettings = """
                                1. PIN code request
                                2. Call Barring Service
                                3. Fixed Dialling
                                4. Closed User Group
                                5. Phone Security
                                6. Change Access Codes
                                """;
                        System.out.println(securitysettings);
                        int seecuritysetprompt = scan.nextInt();
                        switch (seecuritysetprompt) {
                            case 1 -> System.out.println("PIN Code request");
                            case 2 -> System.out.println("Call Bearing Service");
                            case 3 -> System.out.println("Fixed Dialling");
                            case 4 -> System.out.println("Closed User Group");
                            case 5 -> System.out.println("Phone Security");
                            case 6 -> System.out.println("Change Access Codes");
                            default -> System.out.println("Enter the right choice");
                        }
                    }
                    case 4 -> System.out.println("Restore Factory Settings");
                }
            case 7:
                System.out.println("Call Divert");
                break;
            case 8:
                System.out.println("Games");
                break;
            case 9:
                System.out.println("Calculator");
                break;
            case 10:
                System.out.println("Reminders");
                break;
            case 11:
                System.out.println("Clock");
                String clock = """
                        1. Alarm Clock
                        2. Clock Settings
                        3. Date Setting
                        4. Stopwatch
                        5. Countdown timer
                        6. Auto Update of date and time
                        """;
                            System.out.println(clock);
                        int clockprompt = scan.nextInt();
                        switch (clockprompt){
                            case 1 -> System.out.println("Alarm Clock");
                            case 2-> System.out.println("Clock Settings");
                            case 3-> System.out.println("Date Settings");
                            case 4-> System.out.println("Stopwatch");
                            case 5-> System.out.println("Countdown timer");
                            case 6 -> System.out.println("Auto Update of date and time");
                        }
                        break;
            case 12:
                System.out.println("Profiles");
                break;
            case 13:
                System.out.println("SIM services");
                break;
        }

    }
}
