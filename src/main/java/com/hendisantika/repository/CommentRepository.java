package com.hendisantika.repository;

import com.hendisantika.domain.Comment;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import io.quarkus.hibernate.orm.panache.runtime.JpaOperations;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : quarkus-post-service
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 15/10/21
 * Time: 08.40
 */
@ApplicationScoped
public class CommentRepository implements PanacheRepositoryBase<Comment, String> {
    @Transactional
    public Comment save(Comment comment) {
        EntityManager em = JpaOperations.INSTANCE.getEntityManager();
        if (comment.getId() == null || comment.getId().trim().isEmpty()) {
            em.persist(comment);
            return comment;
        } else {
            return em.merge(comment);
        }
    }


    public List<Comment> allByPostId(String id) {
        return this.list("post.id", id);
    }
}
