package com.it.onex.dagger3;

import com.it.onex.dagger3.ano.PreActivity;

import dagger.Component;

/**
 * Created by Linsa on 2018/3/18:17:04.
 * des:
 */

@PreActivity
@Component(modules = UserModule.class,dependencies = AppComponent.class)
public interface LoginComponent {
    void  inject(LoginActivity activity);
}
