package Creational.Prototype.Profile;

public class VietnameseProfile implements Profile {
    private String name;
    private String dateOfBirth;
    private String address;

    public VietnameseProfile(String name, String dateOfBirth, String address) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    @Override
    public Profile cloneProfile() {
        return new VietnameseProfile(name, dateOfBirth, address);
    }

    @Override
    public void printProfile() {
        System.out.println("Họ tên: " + name);
        System.out.println("Ngày sinh: " + dateOfBirth);
        System.out.println("Địa chỉ: " + address);
    }
}