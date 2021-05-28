package net.linebotnotify.linebotnotify.entity;

import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Messages {
    @Id
    @NotNull
    private Long messageId;
}
