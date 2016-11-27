package dto;
// Generated 26/11/2016 08:01:01 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ProfesorId generated by hbm2java
 */
@Embeddable
public class ProfesorId  implements java.io.Serializable {


     private String tipoDocumento;
     private String documento;

    public ProfesorId() {
    }

    public ProfesorId(String tipoDocumento, String documento) {
       this.tipoDocumento = tipoDocumento;
       this.documento = documento;
    }
   


    @Column(name="Tipo_Documento", nullable=false, length=5)
    public String getTipoDocumento() {
        return this.tipoDocumento;
    }
    
    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }


    @Column(name="Documento", nullable=false, length=45)
    public String getDocumento() {
        return this.documento;
    }
    
    public void setDocumento(String documento) {
        this.documento = documento;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ProfesorId) ) return false;
		 ProfesorId castOther = ( ProfesorId ) other; 
         
		 return ( (this.getTipoDocumento()==castOther.getTipoDocumento()) || ( this.getTipoDocumento()!=null && castOther.getTipoDocumento()!=null && this.getTipoDocumento().equals(castOther.getTipoDocumento()) ) )
 && ( (this.getDocumento()==castOther.getDocumento()) || ( this.getDocumento()!=null && castOther.getDocumento()!=null && this.getDocumento().equals(castOther.getDocumento()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getTipoDocumento() == null ? 0 : this.getTipoDocumento().hashCode() );
         result = 37 * result + ( getDocumento() == null ? 0 : this.getDocumento().hashCode() );
         return result;
   }   


}


