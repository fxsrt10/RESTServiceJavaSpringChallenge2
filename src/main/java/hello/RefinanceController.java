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
@RequestMapping("/refinance")
public class RefinanceController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    
    

    @RequestMapping(method = RequestMethod.GET)
    @Async
    public List<Purchase> getPurchases(){
    	final MySQLConnection db = new MySQLConnection();
    	List<Purchase> purchases = new ArrayList<>();
    	purchases = db.getPurchases();
    	
    	
    	
    	
    	return purchases;    	
    }
    @RequestMapping(method = RequestMethod.GET, value = "{id}")
    public Purchase getById(@PathVariable String id) {
    	final MySQLConnection db = new MySQLConnection();
    	
        Double amount = db.getMortgageAmountRef(id);
        Purchase p = new Purchase();        
        p.setId(Long.valueOf(id));
        p.setOrigMortgageAmount(amount);
    	return p;
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/city/{city}")
    public List<Purchase> getPurchasesByCity(@PathVariable String city){
    	final MySQLConnection db = new MySQLConnection();
    	List<Purchase> purchases = new ArrayList<>();
    	purchases = db.getPurchasesByCityRef(city);
    	
    	
    	
    	
    	return purchases;    	
    }
    @RequestMapping(method = RequestMethod.GET, value = "/averageByCity")
    public List<Purchase> getAverageByCity(){
    	final MySQLConnection db = new MySQLConnection();
    	List<Purchase> purchases = new ArrayList<>();
    	purchases = db.getAverageMortgageAmountByCityRef();
    	
    	
    	
    	
    	return purchases;    	
    }
    @RequestMapping(method = RequestMethod.GET, value = "/zip/{zip}")
    public List<Purchase> getPurchasesByZip(@PathVariable String zip){
    	final MySQLConnection db = new MySQLConnection();
    	List<Purchase> purchases = new ArrayList<>();
    	purchases = db.getPurchasesByCityRef(zip);
    	
    	
    	
    	
    	return purchases;    	
    }
}
