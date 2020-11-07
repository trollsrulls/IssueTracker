package org.mpatapenka.issuetracker.api.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import java.time.ZonedDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
public class TaskActivity extends IdentifiedEntity {

    @NotNull
    @ManyToOne
    @JoinColumn(name = "task_id", nullable = false)
    private Task task;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "added_by", nullable = false)
    private Employee addedBy;

    @NotNull
    private ZonedDateTime startedAt;

    @NotNull
    private ZonedDateTime completedAt;

    @Lob
    private String comment;
}