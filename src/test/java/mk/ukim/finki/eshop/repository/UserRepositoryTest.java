package mk.ukim.finki.eshop.repository;


import mk.ukim.finki.eshop.model.User;
import mk.ukim.finki.eshop.model.enumerations.Role;
import mk.ukim.finki.eshop.model.projections.UserProjection;
import mk.ukim.finki.eshop.repository.jpa.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testFindAll() {
        List<User> userList = this.userRepository.findAll();
        Assert.assertEquals(1L, userList.size());
    }

    @Test
    public void testFetchAll() {
        List<User> userList = this.userRepository.fetchAll();
        Assert.assertEquals(1L, userList.size());
    }

    @Test
    public void testLoadAll() {
        List<User> userList = this.userRepository.loadAll();
        Assert.assertEquals(1L, userList.size());
    }

    @Test
    public void testProjectUsernameAndNameAndSurname() {
        UserProjection userProjection = this.userRepository.findByRole(Role.ROLE_ADMIN);
        Assert.assertEquals("filip.dimovski", userProjection.getUsername());
        Assert.assertEquals("Filip", userProjection.getName());
        Assert.assertEquals("Dimovski", userProjection.getSurname());
    }
}
