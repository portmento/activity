package com.example.activity.controller;


import com.example.activity.common.entity.Result;
import com.example.activity.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/activity")
public class ActivityController {

    @Autowired
    private ActivityService activityService;

    /**
     *活动分享
     **/
    @RequestMapping(path = {"/share"})
    public Result share (){
        return activityService.share();
    }
}
