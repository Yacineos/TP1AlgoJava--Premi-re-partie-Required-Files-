package tde1;
public class Date {

    int j, m,a;
    
    
    public Date(int j, int m) {
        this.j =j;
        this.m =m;
        this.a=2022;
    }

    public Date(int j, int m, int a) {
        this.j=j;
        this.m=m;
        this.a=a;
    }
    
    public int getMonth(){
        return this.m;
    }
    public int getDay(){
        return this.j;
    }
    public int getYear(){
        return this.a;
    }
    
    public void setDay(int j){
        this.j=j;
    }
    public void setMonth(int m){
        this.m=m;
    }
    public void setYear(int a){
        this.a=a;
    }
    /**
     * Cette méthode spéciale permet d'afficher un objet avec les fonctions d'affichage de java.
     * @return la chaine de caractère représentant cet objet
     */
    public String toString() {
        return "" + this.getDay() + "/" + this.getMonth() + "/" + this.getYear();
    }
    // TODO Réaliser toutes les méthodes de la spécification de la classe tde1.Date
    // 
    
    /* C'est une fonction qui retourne c'est une année bissextiles ou pas 
    * en entrée on a une date 
    * en sortie on a un booleen 
    * et si c'est bissextile il y a fevrier 29 
    */
    public static Boolean bissextile(int a){
        if(a % 4 == 0 && ((a % 100>0)||(a % 400 == 0))){
            return true;
        }else{
            return false ;
        }
    }
    
    public Date lendemain (){
        Date temp = new Date(1,2,2002);

          if(this.getMonth()==1 ||this.getMonth()==3 ||this.getMonth()==5 ||this.getMonth()==7 ||this.getMonth()==8 ||this.getMonth()==10 ||this.getMonth()==12){ 
              if(this.getDay()==31 && this.getMonth() != 12){
                 temp.setMonth(this.getMonth()+1);
                 temp.setDay(1);
                 temp.setYear(this.getYear());
                return temp;
               }
               if(this.getDay()==31){
                 temp.setDay(1);
                 temp.setMonth(1);
                 temp.setYear(this.getYear()+1);
                return temp;
                };
                temp.setDay(this.getDay()+1);
                temp.setMonth(this.getMonth());
                temp.setYear(this.getYear());
                return temp;
          }else{
               if(this.getMonth()==4 ||this.getMonth()==6 ||this.getMonth()==9 ||this.getMonth()==11){
                  if(this.getDay()==30){
                    temp.setMonth(this.getMonth()+1);
                    temp.setDay(1);
                    temp.setYear(this.getYear());
                    return temp;
                     };
                    temp.setDay(this.getDay()+1);
                    temp.setMonth(this.getMonth());
                    temp.setYear(this.getYear());
                    return temp;
               }else{
    
               if(bissextile(this.getYear())){
                    if(this.getDay()==29){
                       temp.setMonth(this.getMonth()+1);
                       temp.setDay(1);
                       temp.setYear(this.getYear());
                       return temp;
                    }
                    temp.setDay(this.getDay()+1);
                   temp.setMonth(this.getMonth());
                   temp.setYear(this.getYear());
                   return temp ;    

               }else{ 
               if(this.getDay()==28){
                       temp.setMonth(3);
                       temp.setDay(1);
                       temp.setYear(this.getYear());
                       return temp;
                   }
                   temp.setDay(this.getDay()+1);
                   temp.setMonth(this.getMonth());
                   temp.setYear(this.getYear());
                   return temp ;    
             }
            }
               
           }

    }

    
    public Date nJoursPlusTard(int n){
        Date temp = new Date(this.getDay(),this.getMonth(),this.getYear());
        Date temp2 = new Date(2,4,2002);
        for(int i=0;i<n;i++){
            temp2=temp.lendemain();
            temp=temp2;
        }
        return temp ;
        
    }
    
    public void ajouter1Jour(){
        Date temp = this.lendemain();
        this.setDay(temp.getDay());
        this.setMonth(temp.getMonth());
        this.setYear(temp.getYear());
    }
    
    public void ajouterNJours(int n){
        for(int i = 0 ; i<n ; i++){
            this.ajouter1Jour();
        }
    }
    
    // TODO Une fois que les autres méthodes sont faites, faites en sorte que cette classe réalise le contrat tde1.DateComparable.
    // 
    /**
     * fonction de comparaison de this avec d. renvoie vrai ssi this est avant d.
     * @param d la tde1.Date avec laquelle this est comparée
     * @return vrai ssi this est avant d
     */
     
    public boolean estAvant(Date d){
        if(this.getYear() < d.getYear()){
            if(this.getMonth() < d.getMonth()){
                if(this.getDay() < d.getDay()){
                    return true ;
                }
            }
        }
        return false ;
    }
}
