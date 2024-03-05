package Creational.Prototype.Profile;

public class Main {
    public static void main(String[] args) {
        // Tạo một hồ sơ cá nhân gốc
        Profile originalProfile = new VietnameseProfile("Nguyễn Văn A", "01/01/1990", "Hà Nội");

        // Sao chép hồ sơ cá nhân
        Profile clonedProfile = originalProfile.cloneProfile();

        // In thông tin hồ sơ cá nhân gốc và sao chép
        System.out.println("Thông tin hồ sơ cá nhân gốc:");
        originalProfile.printProfile();

        System.out.println("\nThông tin hồ sơ cá nhân sao chép:");
        clonedProfile.printProfile();
    }
}
