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
@Table(name = "estudiante")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Estudiante {

    @Id
    private Integer id;
    private String run;
    private String nombres;
    private String correo;
    private char jornada;
    private Integer telefono;

    @ManyToOne
    @JoinColumn(name = "codigo_carrera", nullable = false)
    private Carrera carrera;

    // Getters and Setters
}
