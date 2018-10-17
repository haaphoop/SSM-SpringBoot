package com.howie.controller;

import com.howie.sevice.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA
 *
 * @author yuanhaoyue swithaoy@gmail.com
 * @description
 * @date 2018-02-12
 * @time 0:48
 */
@RestController
public class MyController {
    private final MyService myService;

    @Autowired
    public MyController(MyService myService) {
    	String str = null;
    	if (str.equals("tt")) {
    		System.out.println("fdsaf");
    	}
        this.myService = myService;
    }

    @RequestMapping(value = "/test")
    public String getShufflingImg(){
    	String _ttt = "";
    	System.out.println("fdsaf");
        return myService.test();
    }
}
