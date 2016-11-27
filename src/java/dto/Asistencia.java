package dto;
// Generated 26/11/2016 08:01:01 PM by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Asistencia generated by hbm2java
 */
@Entity
@Table(name="asistencia"
    ,catalog="mydb"
)
public class Asistencia  implements java.io.Serializable {


     private AsistenciaId id;
     private Estudiante estudiante;

    public Asistencia() {
    }

    public Asistencia(AsistenciaId id, Estudiante estudiante) {
       this.id = id;
       this.estudiante = estudiante;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="estudianteTipoDocumento", column=@Column(name="Estudiante_Tipo_Documento", nullable=false, length=5) ), 
        @AttributeOverride(name="estudianteDocumento", column=@Column(name="Estudiante_Documento", nullable=false, length=45) ), 
        @AttributeOverride(name="claseIdClase", column=@Column(name="Clase_idClase", nullable=false) ), 
        @AttributeOverride(name="claseGrupoCursoIdCurso", column=@Column(name="Clase_Grupo_Curso_id_Curso", nullable=false) ), 
        @AttributeOverride(name="claseGrupoIdGrupo", column=@Column(name="Clase_Grupo_idGrupo", nullable=false) ) } )
    public AsistenciaId getId() {
        return this.id;
    }
    
    public void setId(AsistenciaId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumns( { 
        @JoinColumn(name="Estudiante_Tipo_Documento", referencedColumnName="Tipo_Documento", nullable=false, insertable=false, updatable=false), 
        @JoinColumn(name="Estudiante_Documento", referencedColumnName="Documento", nullable=false, insertable=false, updatable=false) } )
    public Estudiante getEstudiante() {
        return this.estudiante;
    }
    
    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }




}

