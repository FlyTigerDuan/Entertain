package com.dfh.enter.service.impl;

public interface RedisService {
    public void set(String key, Object value) ;

    /**
     * 将 key，value 存放到redis数据库中，设置过期时间单位是秒
     *
     */
    public void set(String key, Object value, long expireTime) ;

    /**
     * 判断 key 是否在 redis 数据库中
     *
     * @param key
     * @return
     */
    public boolean exists(final String key) ;

    /**
     * 获取与 key 对应的对象
     *
     * @param key
     * @param clazz
     *            目标对象类型
     * @param <T>
     * @return
     */
    public <T> T get(String key, Class<T> clazz) ;

    /**
     * 获取 key 对应的字符串
     *
     * @param key
     * @return
     */
    public String get(String key) ;

    /**
     * 删除 key 对应的 value
     *
     * @param key
     */
    public void delete(String key) ;
}
