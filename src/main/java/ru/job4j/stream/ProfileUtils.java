package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public class ProfileUtils {

    public List<Address> collect(List<Profile> profiles) {
        return profiles.stream().map(Profile::getAddress).collect(Collectors.toList());
    }

    public List<Address> uniqueAddress(List<Address> addresses) {
        return addresses.stream().sorted(Address::compareTo).distinct().collect(Collectors.toList());
    }
}
