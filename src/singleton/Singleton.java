/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author tavoGeek
 */
public class Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Men menOne = Men.getInstance("Gustavo", "Castillo", 32);
        Men menTwo = Men.getInstance("Prueba", "Prueba", 0);

        System.out.println(menOne.getName());
        System.out.println(menOne.playSoccer());
        System.out.println(menOne.buildLaptop());
        System.out.println(menTwo.getName());
        System.out.println(menTwo.playSoccer());
        System.out.println(menTwo.buildLaptop());

        menOne.setName("PRUEBA");
        menTwo.setName("PRUEBA 2");

        System.out.println(menOne.getName());
        System.out.println(menOne.playSoccer());
        System.out.println(menOne.buildLaptop());
        System.out.println(menTwo.getName());
        System.out.println(menTwo.playSoccer());
        System.out.println(menTwo.buildLaptop());
        
        Girl girlOne = Girl.getInstance("Ana", "Castillo", 32);
        Girl girlTwo = Girl.getInstance("Elisa", "Prueba", 0);

        System.out.println(girlOne.getName());
        System.out.println(girlOne.playVolleyball());
        System.out.println(girlOne.buildMonitor());
        System.out.println(girlTwo.getName());
        System.out.println(girlTwo.playVolleyball());
        System.out.println(girlTwo.buildMonitor());

        girlOne.setName("Maria");
        girlTwo.setName("Karla");

        System.out.println(girlOne.getName());
        System.out.println(girlOne.playVolleyball());
        System.out.println(girlOne.buildMonitor());
        System.out.println(girlTwo.getName());
        System.out.println(girlTwo.playVolleyball());
        System.out.println(girlTwo.buildMonitor());
        
    }

}
