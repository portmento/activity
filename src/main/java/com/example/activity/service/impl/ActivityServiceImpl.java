package com.example.activity.service.impl;

import com.example.activity.common.entity.Result;
import com.example.activity.service.ActivityService;
import org.springframework.stereotype.Service;

@Service
public class ActivityServiceImpl implements ActivityService {


    public Result share(){
        return Result.wrapSuccessfulResult("");
    }
}
