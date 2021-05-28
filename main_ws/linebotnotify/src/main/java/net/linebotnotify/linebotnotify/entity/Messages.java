package net.linebotnotify.linebotnotify.entity;

import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

public class Messages {
    @Id
    @NotNull
    private Long messageId;

}
