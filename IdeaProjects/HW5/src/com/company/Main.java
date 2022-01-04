package com.company;

public class Main {

    private static final String CREDENTIAL_PATTERN = "(?=.[0-9a-zA-Z_]+$).{0,20}";

    public static void main(String[] args) {
        String login = "Логін";
        String pass = "Пароль";
        String confirmPassword = "Пароль";

        System.out.println("Данні вірні: " + isCredentialsValid(login, pass, confirmPassword));
    }

    private static boolean isCredentialsValid(String login, String pass, String confirmPassword) {
        boolean valid = true;

        try {
            if (!login.matches(CREDENTIAL_PATTERN)) {
                throw new WrongLoginException("Некоректний Логін");
            } else if (!pass.matches(CREDENTIAL_PATTERN) || !pass.equals(confirmPassword)) {
                throw new WrongPasswordException("Некоректний пароль");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            System.err.println("Помилка: " + e.getMessage());
            valid = false;
        }

        return valid;
    }
}
