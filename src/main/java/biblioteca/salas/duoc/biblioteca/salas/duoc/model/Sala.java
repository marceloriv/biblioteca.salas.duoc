package biblioteca.salas.duoc.biblioteca.salas.duoc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "sala")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sala {

    @Id
    private Integer codigo;
    private String nombre;
    private Integer capacidad;
    private Integer idInstituo;

    @ManyToOne
    @JoinColumn(name = "id_tipo", nullable = false)
    private TipoSala tipoSala;

    // Getters and Setters
}
