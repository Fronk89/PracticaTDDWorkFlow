
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class VasoTest
{
    
    @Test 
    public void devolverVasoSiExisten()
    {
        Vaso vasosPequenos = new Vaso(2,10);
        
        boolean resultado = vasosPequenos.hasVasos(1);
        
       assertEquals(true, resultado);
    }
    
    
    @Test 
    public void devolverVasoSiNoExisten()
    {
        Vaso vasosPequenos = new Vaso(1,10);
        
        boolean resultado = vasosPequenos.hasVasos(2);
        
       assertEquals(false, resultado);
    }
    
    @Test
    public void restarCantidadDeVasos()
    {
        Vaso vasosPequenos = new Vaso(5,10);
        
        vasosPequenos.giveVasos(1);
        
        assertEquals(4, vasosPequenos.getCantidadVasos());
        
    }
}
