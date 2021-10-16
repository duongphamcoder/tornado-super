package com.example.jollibee.jollibee.config;

import com.example.jollibee.jollibee.model.User;
import com.example.jollibee.jollibee.dao.UserCrud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    UserCrud userCrud;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userCrud.findByUsername(username);
        Set<String> role = new HashSet<>();
        role.add("ROLE_USER");
        role.add("ROLE_ADMIN");
        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        if (role != null) {
            for (String item:role) {
                GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(item);
                grantedAuthorities.add(grantedAuthority);
            }
        }
        UserDetails userDetails = new org.springframework.security.core.userdetails.User(user.getUsername(),
                user.getPassword(),grantedAuthorities);
        return userDetails;
    }
}
