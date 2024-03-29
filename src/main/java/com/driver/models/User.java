package com.driver.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;

    @OneToMany(mappedBy = "user" , cascade = CascadeType.ALL) // mapped by child name of FK
    private List<Blog> BlogList;



    public User() {
    }

    public User(int id, String userName, String password, String firstName, String lastName) {
        this.id = id;
        this.username = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public List<Blog> getBlogList() {
        return BlogList;
    }

    public void setBlogList(List<Blog> blogList) {
        BlogList = blogList;
    }

//    public List<Blog> getListOfBlogs() {
//        return BlogList;
//    }


//   public void setListOfBlogs(List<Blog> listOfBlogs) {
//        this.BlogList = listOfBlogs;
//    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


//    public List<Blog> getBlogList() {
//    }

}