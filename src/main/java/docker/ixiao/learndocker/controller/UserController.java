package docker.ixiao.learndocker.controller;

import docker.ixiao.learndocker.entity.DkUser;
import docker.ixiao.learndocker.service.impl.DkUserServiceImpl;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j(topic = "UserController")
@RequestMapping("/api/v1/user")
public class UserController {


    private final DkUserServiceImpl dkUserService;

    public UserController(DkUserServiceImpl dkUserService) {
        this.dkUserService = dkUserService;
    }


    @PostMapping("/add")
    public Boolean add(DkUser dkUser) {
        return dkUserService.save(dkUser);
    }

    @GetMapping("/get")
    public List<DkUser> get() {
        List<DkUser> list = dkUserService.list();
        return list;
    }


}
