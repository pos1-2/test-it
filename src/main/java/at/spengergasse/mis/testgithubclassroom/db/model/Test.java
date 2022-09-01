package at.spengergasse.mis.testgithubclassroom.db.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;
import org.hibernate.annotations.NaturalId;

import java.util.UUID;

@Entity
@Data
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @NaturalId
    @EqualsAndHashCode.Include
    @NonNull
    @Builder.Default
    UUID uuid = UUID.randomUUID();

    @Column
    String test;
}
