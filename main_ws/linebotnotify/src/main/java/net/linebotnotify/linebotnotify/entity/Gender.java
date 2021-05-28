package net.linebotnotify.linebotnotify.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "gender")
public class Gender {
    // fields
    @Id
    @NotNull
    private Byte gender_id;

    @Column
    @NotEmpty
    private String gender_name;

    public Byte getGender_id() {
        return this.gender_id;
    }

    public void setGender_id(Byte gender_id) {
        this.gender_id = gender_id;
    }

    public String getGender_name() {
        return this.gender_name;
    }

    public void setGender_name(String gender_name) {
        this.gender_name = gender_name;
    }
}
