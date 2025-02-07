package dev.spring_boot_web_API.runnerz.user;

public record Adress(
        String street,
        String suite,
        String city,
        String zipcode,
        Geo geo
) {
}
