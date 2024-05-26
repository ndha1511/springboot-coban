package com.code.springbootcoban.services.impls;
import com.code.springbootcoban.services.interfaces.HelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayString(String text) {
        return text;
    }
}
