package com.hendisantika.springbootcrudthymeleaf;

import com.hendisantika.springbootcrudthymeleaf.entity.User;
import org.junit.Ignore;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-crud-thymeleaf
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 18/11/18
 * Time: 05.49
 * To change this template use File | Settings | File Templates.
 */
public class UserUnitTest {
    @Test
    public void whenCalledGetNamethenCorrect() {
        User user = new User("Uzumaki Naruto", "uzumaki_naruto@konohagakure.co.jp");

        assertThat(user.getName()).isEqualTo("Uzumaki Naruto");
    }

    @Test
    public void whenCalledGetEmailthenCorrect() {
        User user = new User("Uzumaki Naruto", "uzumaki_naruto@konohagakure.co.jp");

        assertThat(user.getEmail()).isEqualTo("uzumaki_naruto@konohagakure.co.jp");
    }

    @Test
    public void whenCalledSetNamethenCorrect() {
        User user = new User("Uzumaki Naruto", "uzumaki_naruto@konohagakure.co.jp");

        user.setName("Uzumaki Naruto");

        assertThat(user.getName()).isEqualTo("Uzumaki Naruto");
    }

    @Test
    public void whenCalledSetEmailthenCorrect() {
        User user = new User("Uzumaki Naruto", "uzumaki_naruto@konohagakure.co.jp");

        user.setEmail("uzumaki_naruto@hokage.co.jp");

        assertThat(user.getEmail()).isEqualTo("uzumaki_naruto@hokage.co.jp");
    }

    @Test
    @Ignore
    public void whenCalledtoStringthenCorrect() {
        User user = new User("Uzumaki Naruto", "uzumaki_naruto@konohagakure.co.jp");
        assertThat(user.toString()).isEqualTo("User{id=0, name=Uzumaki Naruto, email=uzumaki_naruto@konohagakure.co.jp}");
    }
}
