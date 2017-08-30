package main;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Макс on 21.08.2017.
 */
public class MyService {

    @Autowired
    private MyDao userDao;

    public List getAllUsers(){
        return userDao.getAllUser();
    }

}
