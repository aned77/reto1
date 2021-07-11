/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retoi;

import classes.clsPerson;

/**
 *
 * @author familia aguirre
 */
public class RetoI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      clsPerson person1 = new clsPerson();
      person1.setName("andres");
      person1.setAge(40);
      person1.setId("CC");
      person1.setNumberId(78522035);
      person1.setPhone(7586465);
      person1.setAdress("cra 25 45 - 78");
      person1.setGender('m');
      person1.setWeight(79.5f);
      person1.setHeight(1.80f);
      
      clsPerson person2 = new clsPerson("alejo",15,"TI",102545874 ,3568974,"clle 6 25 -56",'m',45.5f,1.6f);
      System.out.println("  nombre: " + person1.getName()+ "\n" + "  Con " + person1.getId() + ": " + person1.getNumberId () +"\n" +"  Numero telefonico: " + person1.getPhone()+
              "\n" + "  Tiene " + person1.getAge() + " de edad" + "\n" + "  Vive en la " + person1.getAdress());
      
    }
    
}
