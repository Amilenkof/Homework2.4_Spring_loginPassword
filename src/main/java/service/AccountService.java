package service;

import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;
import org.springframework.stereotype.Service;

@Service
public interface AccountService {


    static boolean checkAccoutData(String login, String password, String confirmPass) {

        return false;
    }

    static boolean checkSymbols(String string)  {


        if (string == null) {
            return false;
        }
        string = string.toLowerCase();
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (c == '_') {//поправить проверку
                return false;
            } else if (!(c >= 'a' && c <= 'z')) {
                return false;
            } else if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    static boolean checkLenghtLogin(String s) {
        try {
            return s.length() <= 20;
        } catch (WrongLoginException e) {
            System.out.println("ошибка WrongLoginException ");
            throw new WrongLoginException("Логин слишком длинный, введите не более 20 символов");
        }


    }

    static boolean checkLenghtPassword(String s) {

        return (s.length() < 20);//надо ошибку чекать?


    }

    static boolean checkLogin(String login) {
        return (checkLenghtLogin(login) && checkSymbols(login));
    }

    static boolean checkPassword(String password, String confirmPassword) {
        if (!password.equals(confirmPassword)) {
            System.out.println("ошибка WrongPasswordException ");
            throw new WrongPasswordException("Введенный пароль не совпадает с подтверждением пароля");

        }
        return ( checkLenghtPassword(password) && checkSymbols(password));
    }
}


