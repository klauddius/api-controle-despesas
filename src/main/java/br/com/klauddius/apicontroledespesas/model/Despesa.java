package br.com.klauddius.apicontroledespesas.model;

import lombok.*;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.util.Date;

@EqualsAndHashCode
@ToString
@NoArgsConstructor
public class Despesa {

    @Id
    @Getter
    @Setter
    public Integer id;

    @Getter
    @Setter
    public LocalDate data;

    @Getter
    @Setter
    public String descricao;
}
