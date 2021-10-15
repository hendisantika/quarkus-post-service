package com.hendisantika.repository;

import com.hendisantika.domain.Post;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import io.quarkus.panache.common.Sort;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

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
    public List<Post> findAllPosts() {
        return this.listAll(Sort.descending("createdAt"));
    }

//    public Stream<Post> findByKeyword(String q, int offset, int limit) {
//        if (q == null || q.trim().isEmpty()) {
//            return this.streamAll(Sort.descending("createdAt"))
//                    .skip(offset)
//                    .limit(limit);
//        } else {
//            return this.streamAll(Sort.descending("createdAt"))
//                    .filter(p -> p.title.contains(q) || p.content.contains(q))
//                    .skip(offset)
//                    .limit(limit);
//        }
//    }
}
