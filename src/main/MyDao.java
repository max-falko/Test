package main;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Макс on 21.08.2017.
 */
@Repository
public class MyDao {

        private List<Users> user = Arrays.asList(new Users("Max","2993", 233),
                new Users("Maxim", "58888", 4558));
        public List<Users> getAllUser(){
            return user;
        }
}
