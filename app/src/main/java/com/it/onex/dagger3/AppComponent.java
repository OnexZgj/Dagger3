package com.it.onex.dagger3;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Linsa on 2018/3/18:16:30.
 * des:
 */
@Singleton
@Component (modules = AppMoudle.class)
public interface AppComponent {
    /**
     * 全局单例。所以不用Inject Activity
     *
     * @return 向下返回ApiService实例
     */
    OkhttpUtils getApiService();
}
