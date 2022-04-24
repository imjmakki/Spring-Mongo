package app.springmongo.springmongo.Repo;

import app.springmongo.springmongo.Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface UserRepo extends MongoRepository<User, String> {

    @Query(value = "{userName:'?0'}")
    User findUserByUsername(String username);
}
