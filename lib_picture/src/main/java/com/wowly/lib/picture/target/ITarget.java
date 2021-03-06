package com.wowly.lib.picture.target;

/**
 * <br> ClassName:   ITarget
 * <br> Description: 输出回调接口
 * <br>
 * <br> Author:      lionszhang
 * <br> Date:        2017/8/1 18:08
 */
public interface ITarget<T> {
    /**
     *<br> Description: 加载成功
     *<br> Author:      lionszhang
     *<br> Date:        2017/8/1 18:09
     * @param target
     *                  输出回调接口
     * @return
     *                  是否覆盖，只适用于loadin()方法
     */
    boolean onResourceReady(T target);

    /**
     *<br> Description: 加载失败
     *<br> Author:      lionszhang
     *<br> Date:        2017/8/1 18:10
     * @param message
     *                  失败原因
     */
    void onFailed(String message);
}
