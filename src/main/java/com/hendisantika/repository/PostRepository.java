package com.hendisantika.repository;

import com.hendisantika.domain.Post;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import javax.enterprise.context.ApplicationScoped;

/**
 * Created by IntelliJ IDEA.
 * Project : quarkus-post-service
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 15/10/21
 * Time: 08.43
 */
@ApplicationScoped
public class PostRepository implements PanacheRepositoryBase<Post, String> {

}
