package com.mpfive.food.apple.web.module.screen;

import java.util.Date;

import com.alibaba.citrus.turbine.Context;

/**
 * @author wanghui
 *
 */
public class Index {

    public void execute(Context context) {
        context.put("now", new Date());
    }
}
