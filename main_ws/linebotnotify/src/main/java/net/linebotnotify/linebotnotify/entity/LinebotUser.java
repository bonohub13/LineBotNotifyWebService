package net.linebotnotify.linebotnotify.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "linubot_user")
public class LinebotUser {
    @Id
    @Max(value = 99999)
    @NotNull
    private Integer userId;

    @Column
    @NotBlank
    @Size(max = 30)
    private String userName;

    @Column
    @NotBlank
    private String userLineId;

    @NotNull
    private Date birthdate;

    @OneToOne
    @JoinColumn(name = "genderId")
    private Gender gender;

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserLineId() {
        return this.userLineId;
    }

    public void setUserLineId(String userLineId) {
        this.userLineId = userLineId;
    }

    public Date getBirthdate() {
        return this.birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Gender getGender() {
        return this.gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
