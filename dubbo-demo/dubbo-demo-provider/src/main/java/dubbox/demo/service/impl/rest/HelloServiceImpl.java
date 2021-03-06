package dubbox.demo.service.impl.rest;

import dubbox.demo.service.api.dubbo.DubboHelloService;
import dubbox.demo.service.api.dubbo.User;
import dubbox.demo.service.api.rest.RestHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yangjunming on 2016/11/3.
 */
@Service("restService")
public class HelloServiceImpl implements RestHelloService {

    @Autowired
    DubboHelloService dubboHelloService;

    @Override
    public String ping() {
        return dubboHelloService.ping();
    }

    @Override
    public String register(User user) {
        return dubboHelloService.register(user);
    }
}
