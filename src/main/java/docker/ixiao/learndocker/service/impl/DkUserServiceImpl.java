package docker.ixiao.learndocker.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import docker.ixiao.learndocker.dao.DkUserMapper;
import docker.ixiao.learndocker.entity.DkUser;
import docker.ixiao.learndocker.service.DkUserService;

@Service
public class DkUserServiceImpl extends ServiceImpl<DkUserMapper, DkUser> implements DkUserService {

    private final DkUserMapper dkUserMapper;

    public DkUserServiceImpl(DkUserMapper dkUserMapper) {
        this.dkUserMapper = dkUserMapper;
    }

}
