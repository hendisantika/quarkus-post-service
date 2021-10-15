package com.hendisantika.service;

import com.hendisantika.domain.Comment;
import lombok.extern.slf4j.Slf4j;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

/**
 * Created by IntelliJ IDEA.
 * Project : quarkus-post-service
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 15/10/21
 * Time: 08.45
 */
@ApplicationScoped
@Slf4j
public class Notifier {
    public void onCommentAdded(@Observes Comment comment) {
        log.info("comment saved: {}", comment);
    }
}
