package docker.ixiao.learndocker;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("docker.ixiao.**.dao")
public class LearnDockerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnDockerApplication.class, args);
    }

}
