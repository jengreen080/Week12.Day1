
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer1;

    @Before
    public void before() {printer1 = new Printer(8, 12);}

    @Test
    public void hasNumberOfSheets(){
        assertEquals(8, printer1.getNumberOfSheetsLeft());
    }

    @Test
    public void canAddPaper(){
        printer1.addPaper(2);
        assertEquals(10, printer1.getNumberOfSheetsLeft());
    }

    @Test
    public void canReducePaper(){
        printer1.reducePaper(2);
        assertEquals(6, printer1.getNumberOfSheetsLeft());
    }

    @Test
    public void canPrint(){
        printer1.print(4);
        assertEquals(4, printer1.getNumberOfSheetsLeft());
    }

    @Test
    public void canNotPrint(){
        printer1.print(10);
        assertEquals(8, printer1.getNumberOfSheetsLeft());
    }

    @Test
    public void tonerReduces(){
        printer1.print(2);
        assertEquals(10, printer1.getTonerVolume());
    }
}

