package dev.spring_boot_web_API.runnerz.user;

public record User(
        Integer id,
String name,
        String username,
        String email,
        Adress adress,
        String phone,
        String website,
        Company company
) {
}
