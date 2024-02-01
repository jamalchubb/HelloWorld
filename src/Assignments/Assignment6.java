package Assignments;

public class Assignment6 {
    
    public static class Animal {

        public int age;
        public String gender;
        
        public void IsMammal() {
            System.out.print("This is a public method IsMammal() from Animal class.");
        }
        public void mate() {
            System.out.println("This is a public method mate() for Animal class.");
        }
        
        public class Duck{
            
            public String beakColor;

            public void swim() {
                System.out.println("This is a public method swim() for Duck class.");
            }
            public void quack() {
                System.out.println("This is a public method quack() for Duck class.");
            }
        }

        public class Fish{

            public int sizeInFeet;

            public void canEat() {
                System.out.println("This is a private method canEat() for Fish class.");
                System.out.println(sizeInFeet);

            }

            
            
        }

        public class Zebra{

            public boolean is_wild;
            
            public void run() {
                System.out.println("This is a public method run() for Zebra class.");
            }

        }

        public static void main(String[] args) {
            Animal myAnimal = new Animal();
            System.out.println(myAnimal);

            Fish myFish = new Fish()
            
            
            .sizeInFeet;
            
            
            Zebra myZebra = new Zebra();
            System.out.println(myZebra);

            
        }

    }
        
    

}



    
