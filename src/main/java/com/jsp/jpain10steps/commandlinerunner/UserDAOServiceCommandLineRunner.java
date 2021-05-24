package com.jsp.jpain10steps.commandlinerunner;

import com.jsp.jpain10steps.repository.UserRepository;
import com.jsp.jpain10steps.service.UserDAOService;
import com.jsp.jpain10steps.user.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserDAOServiceCommandLineRunner implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserDAOServiceCommandLineRunner.class);

//    @Autowired
//    private UserDAOService userDAOService;

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Dibyajyoti Dash", "Admin");
        userRepository.save(user);
        LOGGER.info("New user is created : {}", user);
    }
}
