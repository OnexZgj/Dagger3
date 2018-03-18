package com.it.onex.dagger3.ano;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by Linsa on 2018/3/18:16:49.
 * des:
 */
@Scope
@Documented
@Retention(RUNTIME)
public @interface PreActivity {
}
