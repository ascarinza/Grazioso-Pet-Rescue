import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    private static final String acquisitionDate = null;
	private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();

    public static void main(String[] args) {
    	String userInput;

    	Scanner scanner = new Scanner(System.in);
        initializeDogList();
        initializeMonkeyList();

    //Loop that displays menu and takes input until user quits
    displayMenu();
    userInput = scanner.nextLine();
    while (!userInput.equals("q")) {
    	while (!userInput.equals("1") && (!userInput.equals("2")) && (!userInput.equals("3")) &&
    		  (!userInput.equals("4")) && (!userInput.equals("5")) && (!userInput.equals("6"))) {
        	System.out.println("Enter a valid menu selection");
        	userInput = scanner.nextLine();
        }
    //Switch to access users desired control/method
    switch (userInput) {
    case "1":
    	intakeNewDog(scanner);
    	break;
    case "2":
    	intakeNewMonkey(scanner);
    	break;
    case "3": 
    	reserveAnimal(scanner);
    	break;
    case "4":
    case "5":
    case "6":
    	printAnimals(userInput);
    	break;
    }
    displayMenu();
    userInput = scanner.nextLine();
    	}
    	
    }


    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    public static void initializeMonkeyList() {
    	Monkey monkey1 = new Monkey("Jaquavius", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States", "34", "19", "2", "Tamarin");
        Monkey monkey2 = new Monkey("Austin", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States", "12", "14", "9", "Squirrel monkey");
        Monkey monkey3 = new Monkey("Averie", "female", "4", "25.6", "12-12-2019", "Canada", "in service", false, "Canada", "12", "14", "9", "Spider monkey");
        
        monkeyList.add(monkey1);
        monkeyList.add(monkey2);
        monkeyList.add(monkey3);
    }


    //Intakes information for a new dog and only new dog
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }
        //collects new dog info and creates a new dog object
        System.out.println("Dog's Breed: ");
        String breed = scanner.nextLine();
        System.out.println("Dog's gender: ");
        String gender = scanner.nextLine();
        System.out.println("Dog's age: ");
        String age = scanner.nextLine();
        System.out.println("Dog's weight: ");
        String weight = scanner.nextLine();
        System.out.println("Dog's acquisition date: ");
        String acquisitionDate = scanner.nextLine();
        System.out.println("Dog's acquisition country: ");
        String acquisitionCountry = scanner.nextLine();
        System.out.println("Dog's training status: ");
        String status = scanner.nextLine();
        //if (status.equals("in-service")) {
        System.out.println("Is dog in reserves (true or false): ");
        boolean reserves = scanner.nextBoolean();
        System.out.println("Service country: ");
        String serviceCountry = scanner.nextLine();
        
        Dog newDog = new Dog(name, breed, gender, age, weight, acquisitionDate, acquisitionCountry, status, reserves, serviceCountry);

        dogList.add(newDog);

    }


        //creates new monkey object if name and species are valid
        public static void intakeNewMonkey(Scanner scanner) {
            System.out.println("What is the monkey's name?");
            String name = scanner.nextLine();
            for(Monkey monkey: monkeyList) {
                if(monkey.getName().equalsIgnoreCase(name)) {
                    System.out.println("\n\nThis monkey is already in our system\n\n");
                    return; //returns to menu
                }
            }
            //tests for valid species
            System.out.println("What is the monkey's species?");
            String species = scanner.nextLine();
            if (!species.equalsIgnoreCase("capuchin") && (!species.equalsIgnoreCase("guenon")) && (!species.equalsIgnoreCase("macque"))
                && (!species.equalsIgnoreCase("marmoset")) && (!species.equalsIgnoreCase("squirrel monkey")) && (!species.equalsIgnoreCase("tamarin"))) {
                System.out.println("\n\nThis monkey species is not valid for traning\n\n");
                return; //returns to menu
            }
            else {
            	//collects data for new monkey object
            	 System.out.println("Monkey's gender: ");
                 String gender = scanner.nextLine();
                 System.out.println("Monkey's age: ");
                 String age = scanner.nextLine();
                 System.out.println("Monkey's weight: ");
                 String weight = scanner.nextLine();
                 System.out.println("Monkey's acquisition date: ");
                 String acquisitionDate = scanner.nextLine();
                 System.out.println("Monkeys's acquisition country: ");
                 String acquisitionCountry = scanner.nextLine();
                 System.out.println("Monkeys's training status: ");
                 String status = scanner.nextLine();
                 System.out.println("Is monkey in reserves (true or false): ");
                 boolean reserves = scanner.nextBoolean();
                 System.out.println("Service country: ");
                 String serviceCountry = scanner.nextLine();
                 System.out.println("Monkey's tail length: ");
                 String tailLength = scanner.nextLine();
                 System.out.println("Monkey's height: ");
             	 String height = scanner.nextLine();
             	 System.out.println("Monkey's body length: ");
             	 String bodyLength = scanner.nextLine();
             	 
             	 Monkey newMonkey = new Monkey(name, gender, age, weight, acquisitionDate, acquisitionCountry, status, reserves, serviceCountry,
             			 					   tailLength, height, bodyLength, species);
             	 
             	 monkeyList.add(newMonkey);
            }
            
        }

        // reserves an animal by animal type and in service country
        public static void reserveAnimal(Scanner scanner) {
        	boolean noReserves = true;
            System.out.println("Reserving Dog or Monkey? ");
            String userInput = scanner.nextLine();
            System.out.println("Service Country: ");
            String userCountry = scanner.nextLine();
            //reserve dog
            if (userInput.equalsIgnoreCase("dog")) {
            	for (Dog dog : dogList) {
            		if (dog.getTrainingStatus().equals("in-service") && (dog.getReserved() == false) && (dog.getInServiceLocation().equals(userCountry))) {
            			System.out.println(dog.getName() + " is trained and ready to be reserved.");
            			System.out.println("Would you like to reserve " + dog.getName() + "? (Yes or no): ");
            			String userChoice = scanner.nextLine();
            			if (userChoice.equals("yes")) {
            				System.out.println(dog.getName() + " is now in reserve.");
            				dog.setReserved(true);
            				noReserves = false;
            				break;
            			}
            		}
            	}
            	if (noReserves == true) {
            		System.out.println("No dogs eligable to reserve in " + userCountry + ".");
            	}
            }
            
            //reserve monkey
            if (userInput.equalsIgnoreCase("monkey")) {
            	for (Monkey monkey : monkeyList) {
            		if (monkey.getTrainingStatus().equals("in service") && (monkey.getReserved() == false) && (monkey.getInServiceLocation().equals(userCountry))) {
            			System.out.println(monkey.getName() + " is trained and ready to be reserved.");
            			System.out.println("Would you like to reserve " + monkey.getName() + "? (Yes or no): ");
            			String userChoice = scanner.nextLine();
            			if (userChoice.equals("yes")) {
            				System.out.println(monkey.getName() + " is now in reserve.");
            				monkey.setReserved(true);
            				noReserves = false;
            				break;
            			}
            		}
            	
            	}
            	if (noReserves == true) {
            		System.out.println("No monkeys eligable to reserve in " + userCountry + ".");
            	}
            }	
            			
        }
        
        // The printAnimals() method has three different outputs
        // dog - prints the list of dogs
        // monkey - prints the list of monkeys
        // available - prints a combined list of all animals that are
        //Input comes from menu selection
        public static void printAnimals(String userChoice) {
            //prints dogs
        	if (userChoice.equals("4")) {
            	for (Dog dogs : dogList) {
            		System.out.print("Name: "+ dogs.getName() + ", Status: " + dogs.getTrainingStatus() + ", Aquisition Country: " +
            		dogs.getAcquisitionLocation() + ", Reserved: ");
            		if (dogs.getReserved() == true) {
            			System.out.println("Yes");
            		}
            		else {
            			System.out.println("No");
            		}
            	}
            }
        	//prints monkeys
            else if (userChoice.equals("5")) {
            	for (Monkey monkeys : monkeyList) {
            		System.out.print("Name: "+ monkeys.getName() + ", Status: " + monkeys.getTrainingStatus() + ", Aquisition Country: " +
            		monkeys.getAcquisitionLocation() + ", Reserved: ");
            		if (monkeys.getReserved() == true) {
            			System.out.println("Yes");
            		}
            		else {
            			System.out.println("No");
            		}
            	}
            }
        	//prints all available in serive animals
            else if (userChoice.equals("6")) {
            	for (Dog d : dogList) {
            		if (d.getTrainingStatus().equals("in service") && d.getReserved() == false) {
            			System.out.print(d.getName() + " is in service and not reserved.");
            		}
            	}
            	for (Monkey m : monkeyList) {
            		if (m.getTrainingStatus().equals("in service") && m.getReserved() == false) {
            			System.out.print(m.getName() + "is in service and not reserved.");
            		}
            	}
            }
            else {
            	System.out.println("Invalid selection.");
            	return;
            }
            
            

        }
}

