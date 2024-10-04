/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class VehiculoTest {
    private static final Logger LOG = Logger.getLogger(VehiculoTest.class.getName());

    @Test
    public void datosVacios() {
        LOG.info("Iniciando test datosVacios");

        assertThrows(Throwable.class, ()->new Vehiculo("", "", "", "", 0, 0));

        LOG.info("Finalizando test datosVacios");
    }
    @Test
    public void datosNegativos() {
        LOG.info("Iniciando test datosNegativos");

        assertThrows(Throwable.class, ()->new Vehiculo("ABC123", "toyota", "azul", "automatico", -50.000, -2022));

        LOG.info("Finalizando test datosNegativos");
    }

}
