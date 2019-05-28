package com.component.service;


import com.component.bean.BannerBean;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface MService {

    @GET("/banner/json")
    Observable<BannerBean> bannerData();
}
