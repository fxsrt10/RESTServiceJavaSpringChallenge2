package hello;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    public MySQLConnection db = new MySQLConnection();

    @RequestMapping(method = RequestMethod.GET)
    @Async
    public List<Purchase> getPurchases(){
    	List<Purchase> purchases = new ArrayList<>();
    	purchases = db.getPurchases();
    	
    	
    	
    	
    	return purchases;    	
    }
    @RequestMapping(method = RequestMethod.GET, value = "{id}")
    public Purchase getById(@PathVariable String id) {
        Double amount = db.getMortgageAmount(id);
        Purchase p = new Purchase();        
        p.setId(Long.valueOf(id));
        p.setOrigMortgageAmount(amount);
    	return p;
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/city/{city}")
    public List<Purchase> getPurchasesByCity(@PathVariable String city){
    	List<Purchase> purchases = new ArrayList<>();
    	purchases = db.getPurchasesByCity(city);
    	
    	
    	
    	
    	return purchases;    	
    }
}
