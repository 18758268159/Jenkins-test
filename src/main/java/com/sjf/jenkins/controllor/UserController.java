package com.sjf.jenkins.controllor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class UserController {

    @ResponseBody
    @RequestMapping(value = "/getName", method = {RequestMethod.GET, RequestMethod.POST})
    public String getProjetName() {
        return "工程名字是：Jenkins-test";
    }

}
