package ru.eltech.users;

public class User {
    private String userCategory;
    private String name;
    private String email;
    private String password;

    public String getUserCategory() {
        return userCategory;
    }

    public void setUserCategory(String userCategory) {
        this.userCategory = userCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void showInfo(){
        System.out.println(this.getName());
        System.out.println(this.getUserCategory());
        System.out.println(this.getEmail());
    }
}
