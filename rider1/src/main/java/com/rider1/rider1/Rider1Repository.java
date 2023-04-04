package com.rider1.rider1;

import com.rider1.rider1.Rider1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Rider1Repository extends JpaRepository<Rider1, Integer> {

    public Rider1 getRiderById(int i);

    

}