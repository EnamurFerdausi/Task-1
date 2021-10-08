/*Name:Enamur Rabbi Ferdausi
  Id:2012020144
  Section:C
  Email:cse_2012020144@lus.ac.bd
  Date:13-7-2021
 */
package ferdausi;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your section:");
        String section = sc.nextLine();

        // class import
        Info info = new Info();
        Hobby hobby = new Hobby();
        
        //printing all output
        System.out.println(section);
        System.out.println("Name: "+info.name);
        System.out.println("ID: "+info.id);
        System.out.println("Hobby: "+hobby.hobbyName);



    }
}
