package com.kllink.web.controller;

import com.kllink.dto.User;
import com.kllink.dto.UserQueryCondition;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public List<User> query(UserQueryCondition condition,@PageableDefault(page=2,size = 17,sort = "username,asc") Pageable pageable){
        System.out.println(ReflectionToStringBuilder.toString(condition, ToStringStyle.MULTI_LINE_STYLE));
        System.out.println(pageable.getPageSize());
        System.out.println(pageable.getPageNumber());
        System.out.println(pageable.getSort());

        List<User> users = new ArrayList<>();
        users.add(new User());
        users.add(new User());
        users.add(new User());
        return users;
    }
    @RequestMapping(value = "/user/{id:\\d+}",method = RequestMethod.GET)
    public User getInfo(@PathVariable String id){
        User user = new User();
        user.setUsername("tom");
        return user;
    }

}
