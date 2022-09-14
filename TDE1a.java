import  java.util.*;
import tde1.Date;

/**
 * Programme principal de l'activité du TDe1. Lorsque les méthodes demandées seront réalisées,
 * vous pourrez lancer ce programme.
 *
 * Ne modifiez pas les profil des méthodes demandées.
 *
 * Indiquez les noms et prénoms des membres du binome
 * @OUKKAL Yacine
 * @
 */
public class TDE1a {

    public static void main(String[] args) {
        int j , m , a,x ,N;
        Scanner sc = new Scanner(System.in);
        do{
        System.out.println("Jour: ");
         j = sc.nextInt();
        }while(j<1 || j>31);
        do{
        System.out.println("Mois: ");
         m =sc.nextInt();
        }while(m<1 || m>12);
        do{
        System.out.println("Année: ");
         a = sc.nextInt();
        }while(a<=0);
        Date d = new Date(j, m, a);
        System.out.println("La date créée est: " + d.toString());
        Date l = d.lendemain();
        System.out.println("Son lendemain est: " + l.toString());
        do{
        System.out.println("Combien de jours plus tard ?");
            x = sc.nextInt();
        }while(x<=0);
        Date y = d.nJoursPlusTard(x);
        System.out.println("Son "+x+" jours plus tard : " + y.toString());
        d.ajouter1Jour();
        System.out.println("La date après ajout 1 jour est: " + d);
        do{
        System.out.println("Entrez une valeur de N : ");
            N = sc.nextInt();
        }while(N<=0);
        d.ajouterNJours(N-1);
        System.out.println("La date après ajout"+N+"jour est: " + d);
        
        
    }
}
