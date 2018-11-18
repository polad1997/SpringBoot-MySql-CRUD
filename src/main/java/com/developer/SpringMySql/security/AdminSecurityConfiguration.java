package com.developer.SpringMySql.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class AdminSecurityConfiguration extends WebSecurityConfigurerAdapter{
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/resources/**");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/").permitAll().antMatchers("/")
                .hasAnyRole("USER", "ADMIN").antMatchers("/index").hasAnyRole("USER", "ADMIN").antMatchers("/edit").hasAnyRole("USER", "ADMIN")
                .antMatchers("/view").hasAnyRole("USER","ADMIN").anyRequest().authenticated().and().formLogin()
                .permitAll().and().logout().permitAll();

        http.csrf().disable();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder authenticationMgr) throws Exception {
        authenticationMgr.inMemoryAuthentication().withUser("Polad").password("admin")
                .authorities("ROLE_ADMIN");
    }
}
