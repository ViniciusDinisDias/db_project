package br.com.hospital.model;
import java.io.Serializable;
import java.util.Objects;

public class ReceitaRemedioId implements Serializable {
    private Integer idReceita;
    private Integer idRemedio;
    public ReceitaRemedioId() {}
    public ReceitaRemedioId(Integer idReceita, Integer idRemedio){this.idReceita=idReceita;this.idRemedio=idRemedio;}
    @Override public boolean equals(Object o){ if(this==o) return true; if(o==null||getClass()!=o.getClass()) return false; ReceitaRemedioId that=(ReceitaRemedioId)o; return Objects.equals(idReceita,that.idReceita)&&Objects.equals(idRemedio,that.idRemedio);}
    @Override public int hashCode(){ return Objects.hash(idReceita,idRemedio); }
}
