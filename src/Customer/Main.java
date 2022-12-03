package Customer;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
           try(FileWriter fileWriter = new FileWriter("task.txt")){
                fileWriter.write("""
                        Customer деген класс тузунуз.
                            * Полерерин толтурунуз аты, фамилиясы,
                            * туулган олкосу,туулган жылы,почтасы болсун.
                            * Дагы бир service деген интерфейс ачып аны анын
                            * ичине 4 метод жазыныз." +
                            * //                    "1-кардардын жашын кайтаруучу
                            * метод жазыныз,2-мамлекети окшош кардарларды кайтарыныз,
                            * 3-кардарлардын мамлекетин сорттоп чыгарыныз,
                            * 4-баардык кардарларды кайтаруучу метод жазыныз." +
                            *  "Ал интерфейсти Customer клласына impliments кылып\s
                            *  методдорго логикасын жазыныз.Mainдан жазган логиканызды иштетиниз")""");
            }catch (IOException e){
                System.out.println("File not created!");
            }
            try (FileReader fileReader = new FileReader("task.txt")){
                Scanner scanner1 = new Scanner(fileReader);
                while (scanner.hasNextLine()){
                    System.out.println(scanner.nextLine());
                }
            }catch (IOException e){
                System.out.println("File not found!");
            }
            Customer customer1 = new Customer("Dilbar","Bazarbaeva","Kyrgyzstan", LocalDate.of(1990,4,28),"bazarbaevadilbar@gmail.com");
            Customer customer2 = new Customer("Chinara","Bazarbaeva","Russia", LocalDate.of(1985,4,11),"chinara@gmail.com");
            Customer customer3 = new Customer("Akyltai","Shermatov","Armenia", LocalDate.of(1971,8,10),"akyltaiSh@gmail.com");
            Customer[] customers = {customer1,customer2,customer3};
            while (true) {
                System.out.print("Choice 1(Similar country), 2(Sort countries), 3(Show all customers): ");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println(Arrays.toString(customer1.similarCountry(scanner.next(), customers)));
                        break;
                    case 2:
                        System.out.println(Arrays.toString(customer1.sortCountries(customers)));
                        break;
                    case 3:
                        System.out.println(Arrays.toString(customer1.showAllCustomers(customers)));
                        break;
                    default:
                        System.out.println("");
                        break;
                }
            }
    }
}
