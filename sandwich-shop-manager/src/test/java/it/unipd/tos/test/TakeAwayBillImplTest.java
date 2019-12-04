////////////////////////////////////////////////////////////////////
// [Marco] [Nardelotto] [1189563]
////////////////////////////////////////////////////////////////////
package it.unipd.tos.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


import it.unipd.tos.business.TakeAwayBillImpl;
import it.unipd.tos.business.exception.TakeAwayBillException;
import it.unipd.tos.model.MenuItem;
import it.unipd.tos.model.MenuItem.ItemType;

public class TakeAwayBillImplTest {

    TakeAwayBillImpl ordine;
    List<MenuItem> items;
    double tot;
    
    @Before
    public void inizialize() throws TakeAwayBillException{
        ordine = new TakeAwayBillImpl();
        items = new ArrayList<MenuItem>();
        tot=0;
    }
    
    @Test
    public void TestSumMenuItem() throws TakeAwayBillException{
        items.add(new MenuItem(ItemType.Panini,"Panino Vegetariano",5.0));
        items.add(new MenuItem(ItemType.Panini,"Panino Vegetariano",5.0));
        items.add(new MenuItem(ItemType.Bevande,"Acqua Naturale",1.8));
        items.add(new MenuItem(ItemType.Fritti,"Patate Fritte",3.20));

        tot=ordine.getOrderPrice(items);
        assertEquals(15, tot,0);
    }

}
