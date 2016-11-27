package dto;
// Generated 26/11/2016 08:01:01 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Curso generated by hbm2java
 */
@Entity
@Table(name="curso"
    ,catalog="mydb"
)
public class Curso  implements java.io.Serializable {


     private Integer idCurso;
     private Administrador administrador;
     private Profesor profesor;
     private Requisito requisito;
     private String nombre;
     private String contenido;
     private String unidadAcademica;
     private String modalidad;
     private Date fechaInicio;
     private Date fechaFin;
     private String duracion;
     private Set<Matricula> matriculas = new HashSet<Matricula>(0);

    public Curso() {
    }

	
    public Curso(Administrador administrador, Profesor profesor, Requisito requisito, String nombre, String contenido, String unidadAcademica, String modalidad, Date fechaInicio, Date fechaFin, String duracion) {
        this.administrador = administrador;
        this.profesor = profesor;
        this.requisito = requisito;
        this.nombre = nombre;
        this.contenido = contenido;
        this.unidadAcademica = unidadAcademica;
        this.modalidad = modalidad;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.duracion = duracion;
    }
    public Curso(Administrador administrador, Profesor profesor, Requisito requisito, String nombre, String contenido, String unidadAcademica, String modalidad, Date fechaInicio, Date fechaFin, String duracion, Set<Matricula> matriculas) {
       this.administrador = administrador;
       this.profesor = profesor;
       this.requisito = requisito;
       this.nombre = nombre;
       this.contenido = contenido;
       this.unidadAcademica = unidadAcademica;
       this.modalidad = modalidad;
       this.fechaInicio = fechaInicio;
       this.fechaFin = fechaFin;
       this.duracion = duracion;
       this.matriculas = matriculas;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id_Curso", unique=true, nullable=false)
    public Integer getIdCurso() {
        return this.idCurso;
    }
    
    public void setIdCurso(Integer idCurso) {
        this.idCurso = idCurso;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumns( { 
        @JoinColumn(name="Administrador_Responsable_Tipo_Documento", referencedColumnName="Tipo_Documento", nullable=false), 
        @JoinColumn(name="Administrador_Responsable_Documento", referencedColumnName="Documento", nullable=false) } )
    public Administrador getAdministrador() {
        return this.administrador;
    }
    
    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumns( { 
        @JoinColumn(name="Profesor_Tipo_Documento", referencedColumnName="Tipo_Documento", nullable=false), 
        @JoinColumn(name="Profesor_Documento", referencedColumnName="Documento", nullable=false) } )
    public Profesor getProfesor() {
        return this.profesor;
    }
    
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Requisito_idRequisito", nullable=false)
    public Requisito getRequisito() {
        return this.requisito;
    }
    
    public void setRequisito(Requisito requisito) {
        this.requisito = requisito;
    }

    
    @Column(name="Nombre", nullable=false)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    @Column(name="Contenido", nullable=false, length=16777215)
    public String getContenido() {
        return this.contenido;
    }
    
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    
    @Column(name="Unidad_Academica", nullable=false, length=45)
    public String getUnidadAcademica() {
        return this.unidadAcademica;
    }
    
    public void setUnidadAcademica(String unidadAcademica) {
        this.unidadAcademica = unidadAcademica;
    }

    
    @Column(name="Modalidad", nullable=false, length=10)
    public String getModalidad() {
        return this.modalidad;
    }
    
    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="Fecha_Inicio", nullable=false, length=10)
    public Date getFechaInicio() {
        return this.fechaInicio;
    }
    
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="Fecha_Fin", nullable=false, length=10)
    public Date getFechaFin() {
        return this.fechaFin;
    }
    
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    
    @Column(name="Duracion", nullable=false, length=5)
    public String getDuracion() {
        return this.duracion;
    }
    
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="curso")
    public Set<Matricula> getMatriculas() {
        return this.matriculas;
    }
    
    public void setMatriculas(Set<Matricula> matriculas) {
        this.matriculas = matriculas;
    }




}


