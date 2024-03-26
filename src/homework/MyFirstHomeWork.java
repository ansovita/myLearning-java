package homework;

public class MyFirstHomeWork {
    public static void main(String[] args) {

        //Variable: String
        String myText = "I like animals"; {
            System.out.println(myText);
        }
        String text = "Hello! \nIt's a nice day today!"; {
            System.out.println(text);
        }
        String country = "Latvia,";
        String capital = "Riga"; {
            System.out.println(country + " " + capital);
        }
        String firstText = "My name is ";
        String secondText = "Tatjana"; {
            System.out.println(firstText.concat(secondText));
        }
        //Variable: flout
        float myWalkingSpeed = 5.5f; {
            System.out.println(myWalkingSpeed);
        }
        //Variable: int
        int a = 10; int b = 20; {
            System.out.println(a+b);
        }
        int x = 10;
        int y = 5; {
            System.out.println(x > y); //returns true, because 10 is higher than 5
        }
        //Variable: boolean
        boolean IAmBuilder = false;
        boolean IAmNotBuilder = true; {
            System.out.println(IAmBuilder); //Outputs false
            System.out.println(IAmNotBuilder); //Outputs true
        }
    }
}
