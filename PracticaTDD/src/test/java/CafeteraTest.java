
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CafeteraTest 
{
  
        @Test
        public void deberiaDevolverVerdaderoSiExiste()
        {
              Cafetera cafetera = new Cafetera(10);
              
              boolean resultado = cafetera.hasCafe(5);
              
              assertEquals(true, resultado);
        }
        
        @Test
        public void deberiaDevolverFalsoSiNoExiste()
        {
            Cafetera cafetera = new Cafetera(10);
              
              boolean resultado = cafetera.hasCafe(11);
              
              assertEquals(false, resultado);
        }
        
        @Test
        public void deberiaRestarCafeALaCafetera()
        {
            Cafetera cafetera = new Cafetera(10);
            
            cafetera.giveCafe(7);
                    
             assertEquals(3,cafetera.getCantidadCafe());
        }
    
}