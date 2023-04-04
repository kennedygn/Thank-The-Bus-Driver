package com.rider1.rider1;

import com.rider1.rider1.Rider1;
import com.rider1.rider1.Rider1Repository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author kenne
 */
@Service
public class Rider1Service {
    @Autowired
    private Rider1Repository repo;
     
    /*public List<Rider1> getAllRoutes() {
        return repo.findAll();
    }
    
    public Rider1 getLocation(String location) {
        return repo.getRiderLocation(location);
    }*/
    
    Object addMoneyToBusFare(double busFareAmount) {
        Rider1 rider = null;
        rider.fare = busFareAmount;
        busFareAmount = 3.89;
        repo.save(rider);
        return busFareAmount;
    }

    /*public RiderO addMoneyToBusFare(double busFareAmount) {
        return repo.save(busFareAmount);
    }*/

    /*void saveBook (RiderO book) {

        repo.save(book);
    }*/
    
    //updtating, creating, reading, deleting book objects??

}
