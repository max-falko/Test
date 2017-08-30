package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.portlet.ModelAndView;

import java.util.List;

/**
 * Created by Макс on 21.08.2017.
 */
//@Controller
//@RequestMapping("/")
public class MyController {

 //   @Autowired
    private MyService myService;

//    @RequestMapping(value = "/list", method = RequestMethod.GET)
//    public @ResponseBody
    List<Users> getAllUsers(){
        return myService.getAllUsers();
    }

   // @RequestMapping(value = "/validate", method = RequestMethod.GET)
    public ModelAndView validateUsers(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userFromServer", new Users());
        modelAndView.setViewName("users_check_page");
        return modelAndView;
    }



//    @RequestMapping(value = "/check", method = RequestMethod.GET)
 //   public @ResponseBody
 //   String checkUser(@ModelAttribute("userFromServer") Users user){
  //      if( "admin".equals(user.getName())&&"admin".equals(user.getTel())){
  //          return "valid";
 //       }

 //       return "invalid";
 //   }

}
