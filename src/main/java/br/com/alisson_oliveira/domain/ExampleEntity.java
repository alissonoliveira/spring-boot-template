package br.com.alisson_oliveira.domain;

import javax.persistence.*;

/**
 * Created by Alisson on 13/09/2015.
 */
@Entity
@Table(name = "EXAMPLE")
public class ExampleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_ex_id")
    @SequenceGenerator(name = "seq_ex_id", sequenceName = "SEQ_EX_ID", allocationSize = 10)
    @Column(length = 20)
    private Long id;

    private String name;

    public ExampleEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
