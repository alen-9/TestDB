package com.lq.db;

import redis.clients.jedis.Jedis;

public class testRedis {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");
        jedis.set("foo", "bar");
        String value = jedis.get("foo");
        System.out.println(value);
    }
}
