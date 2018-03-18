package com.it.onex.dagger3;

import com.it.onex.dagger3.ano.PreActivity;

import dagger.Component;

/**
 * Created by Linsa on 2018/3/18:16:53.
 * des:
 */
@PreActivity
@Component(modules = UserModule.class ,dependencies = AppComponent.class)
public interface UserComponet {
    void inject(MainActivity activity);
}
