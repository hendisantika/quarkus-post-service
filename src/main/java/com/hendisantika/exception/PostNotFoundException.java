package com.hendisantika.exception;

/**
 * Created by IntelliJ IDEA.
 * Project : quarkus-post-service
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 15/10/21
 * Time: 08.47
 */
public class PostNotFoundException extends RuntimeException {
    public PostNotFoundException(String id) {
        super("Post:" + id + " was not found!");
    }
}
