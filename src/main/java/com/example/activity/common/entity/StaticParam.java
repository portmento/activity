package com.example.activity.common.entity;


public class StaticParam {

    //列表页每页显示个数
    public static final Integer PAGE_NUM = 10;

    //奖品编号已存在
    public static final Integer UPDATE_AWARD_ERROR = 1001;

    //测试
    //public static final String LC_APPKEY = "a1437fd7-9555-42c7-8b3b-273275e4512a";
    //生产
    public static final String LC_APPKEY = "ea6f1a2a-e7e1-462a-869d-019ae1a9204f";
    //测试
    //public static final String LC_APPID = "GT000006";
    //生产
    public static final String LC_APPID = "GT000006";

    public static final String NO_LOGIN = "1001";

    public static final String NO_WHITE = "1002";

    public static final String NO_QUESTIONNAIRE = "1003";

    public static final String ADD_ADDRESS_ERROR = "1004";

    public static final String NO_ACTIVITY = "1005";

    //测试
//    public static final String GET_COUPON_URL = "https://partner-api.gtdreamlife.com/api/goods/getCoupon?couponId=162";
//    public static final String GET_PHONE_URL = "https://partner-sso.gtdreamlife.com/api/auth/info";

    //生产
    public static final String GET_COUPON_URL = "http://ideallife-api.gtdreamlife.com/api/goods/getCoupon?couponId=162";
    public static final String GET_PHONE_URL = "http://ideallife-sso.gtdreamlife.com/api/auth/info";


}
