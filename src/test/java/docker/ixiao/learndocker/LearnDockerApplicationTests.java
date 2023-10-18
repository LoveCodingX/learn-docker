package docker.ixiao.learndocker;

import docker.ixiao.learndocker.entity.DkUser;
import docker.ixiao.learndocker.service.DkUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class LearnDockerApplicationTests {

    @Autowired
    private DkUserService dkUserService;

    @Test
    void contextLoads() {
        List<DkUser> list = dkUserService.list();
        System.out.println(list);
    }

}
