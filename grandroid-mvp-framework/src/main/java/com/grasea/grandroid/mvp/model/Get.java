package com.grasea.grandroid.mvp.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Rovers on 2016/7/19.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Get {
    String value() default "";

    Storage storage() default Storage.Preferences;

    DefaultValue defaultValue() default DefaultValue.NULL;
}
