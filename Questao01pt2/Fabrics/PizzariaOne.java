package Questao01pt2.Fabrics;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class PizzariaOne extends Pizzaria {

    @Override
    public PizzaioloFabric criaPizzaiolo(Date date) {
        Calendar c = new GregorianCalendar(); 
        c.setTime(date); 
        int dia = c.get(c.DAY_OF_WEEK); 
	
        switch(dia) { 
            case Calendar.SUNDAY: 
                System.out.println("Hoje não funcina");
                break;
            case Calendar.MONDAY: 
                return new PizzaioloOneFabric();
            case Calendar.TUESDAY: 
                return new PizzaioloTwoFabric();
            case Calendar.WEDNESDAY: 
                return new PizzaioloOneFabric(); 
            case Calendar.THURSDAY: 
                return new PizzaioloTwoFabric(); 
            case Calendar.FRIDAY: 
                return new PizzaioloOneFabric(); 
            case Calendar.SATURDAY: 
                return new PizzaioloTwoFabric(); 
        }
        return null;
    }
    
}