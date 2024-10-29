package br.com.api.yaso.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Table(name = "subscribers")
@Entity
public class Subscriber {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;


    @Column(name = "nome", nullable = false, columnDefinition = "VARCHAR(255)")
    @NotEmpty(message = "Nome é obrigatório")
    @Schema(description = "Nome", example = "livia")
    private String nome;

    @NotEmpty(message = "Email é obrigatório")
    @Schema(description = "Email", example = "livia@gmail.com")
    @Email(message = "Email deve ser valido")
    @Column(name = "email", nullable = false, columnDefinition = "VARCHAR(255)")
    private String email;

    @NotNull(message = "consentimento é obrigatório")
    @Schema(description = "consentimento", example = "True/False")
    @Column(name = "consentimento", nullable = false, columnDefinition = "TINYINT")
    private Boolean consentimento;

    public Subscriber(Long id, String nome, String email, Boolean consentimento) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.consentimento = consentimento;
    }
}
