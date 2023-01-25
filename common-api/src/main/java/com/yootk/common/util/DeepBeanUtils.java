package com.yootk.common.util;

import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * @author qingle
 * @description
 * @date 2023/1/26
 */

public class DeepBeanUtils extends BeanUtils { // 扩充已有的Bean工具类

    private DeepBeanUtils() {
    }

    /**
     * 实现List集合对象的拷贝处理
     *
     * @param sources 原始对象集合
     * @param target  目标对象集合
     * @param <S>     源对象类型
     * @param <T>     目标对象类型
     * @return 拷贝后的List集合
     */
    public static <S, T> List<T> copyListProperties(List<S> sources, Supplier<T> target) {
        List<T> list = new ArrayList<>(sources.size()); // 开辟一个新的list集合
        for (S source : sources) {
            T t = target.get();
            copyProperties(source, t);
            list.add(t);
        }
        return list;
    }
}
