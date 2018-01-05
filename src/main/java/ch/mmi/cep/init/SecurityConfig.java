package ch.mmi.cep.init;

//import javax.sql.DataSource;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import ch.mmi.cep.service.UserAppDetailsService;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
            http
            .authorizeRequests().antMatchers("/resources/**").permitAll()
            .anyRequest().authenticated()
            .and()
            .formLogin().loginPage("/login").permitAll()
            .and().logout().permitAll();
    }
	
	/*@Autowired
	private DataSource dataSource;*/

	/*@Autowired
	private UserCepDetailsService userCepDetailsService;*/

	/*@Override
	protected void registerAuthentication(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication().dataSource(dataSource);
	}*/

	/*@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.userDetailsService(userAppDetailsService)
			.authorizeRequests()
			.antMatchers("/sec/moderation.html").hasRole("MODERATOR")
			.antMatchers("/admin/**").hasRole("ADMIN")
			.and()
			.formLogin()
			.loginPage("/user-login.html")
			//.defaultSuccessUrl("/success-login.html")
			.defaultSuccessUrl("/home.html")
			.failureUrl("/error-login.html")
			.permitAll()
			.and()
			.logout()
			.logoutSuccessUrl("/index.html");
	}*/
	
    /*@Override
    protected void configure(HttpSecurity http) throws Exception {
            http.authorizeUrls().antMatchers("/**").hasRole("USER").and().formLogin();
    }

    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
            auth.inMemoryAuthentication().withUser("user").password("password").roles("USER");
    }*/

}