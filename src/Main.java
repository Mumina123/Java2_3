import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        User user = new User();
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.print("Ведите имя: ");
            String name = input.nextLine();
            try {
                user.setName(name );
                System.out.println("Ведите возраст: ");
                int age = input.nextInt();
                user.getAge(age);
            } catch (IllegalNameLengthExcepion e) {
                e.printStackTrace();
            }catch (IllegaAgeExcepion e){
                e.printStackTrace();
            }
        }
    }
}