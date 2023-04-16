package com.TTBD.TTBD_final.User;

import org.springframework.stereotype.Service;

/**
 *
 * @author kenne
 */
@Service
public class UserService {

    private UserRepository repo;

    public User getRoleById(String role) {
        return repo.getReferenceById(role);
    }

    /*String toString(String choice) {
        
    }*/
}
