
package inf2050;
import aleatoire.Person;
/**
 *
 * @author Thierry
 */
public class INF2050 {

   
    public static void main(String[] args) {
        
        
        Person p = new Person(args[0],args[1],28);
        
        
        System.out.printf("Bonjour %s %s! Vous avez %d ans. \n",
        p.getFirstName(),p.getLastName(),p.getAge());
    }
    
}
