package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.AccountService;

@RestController
public class Login {

    @GetMapping
    public static boolean setAccountInfo(@RequestParam String login, String password, String confirmPassword) {
        boolean result = (AccountService.checkLenghtLogin(login)) && (AccountService.checkPassword(password, confirmPassword));
        if (result) {System.out.println("setAccountInfo выдает тру"); }
        else{ System.out.println("setAccountInfo выдает тру");}
        return result;
    }
}
//http://localhost:8080/calculator/setaccoutinfo?login=Logi123&pass=pAssW123&passcon=pAss
// http://localhost:8080/calculator/plus?num1=5&num2=5