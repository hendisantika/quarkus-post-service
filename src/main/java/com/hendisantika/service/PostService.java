package com.hendisantika.service;

import com.hendisantika.domain.Comment;
import com.hendisantika.repository.CommentRepository;
import com.hendisantika.repository.PostRepository;
import lombok.RequiredArgsConstructor;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Event;

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
@RequiredArgsConstructor
public class PostService {
    final PostRepository postRepository;
    final CommentRepository commentRepository;
    final Event<Comment> commentEvent;
}
