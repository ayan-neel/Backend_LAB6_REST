package com.gl.debate.service.impl;

import com.gl.debate.entity.User;
import com.gl.debate.repository.UserRepository;
import com.gl.debate.security.MyUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByName(username);
        if(user==null)
            throw new UsernameNotFoundException("User not found");
        return new MyUserDetails(user);
    }
}
