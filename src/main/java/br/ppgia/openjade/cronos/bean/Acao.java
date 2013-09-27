package br.ppgia.openjade.cronos.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;





@Entity
@Table(name = "tb_acao")
public class Acao implements java.io.Serializable {

    private static final long serialVersionUID = 8457914838257793588L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idAcao")
    private Long idAcao;
    private String nomeres;
    private String nomefull;
    private Boolean ibovespa;
    
    
	@OneToMany(mappedBy = "acao", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@Cascade(org.hibernate.annotations.CascadeType.DELETE_ORPHAN)	
	private List<Cotacao> cotacoes = new ArrayList<Cotacao>();
    

    public Acao() {
    }

    public Acao(Long idAcao) {
        this.idAcao = idAcao;
    }

    public Acao(String nomeres) {
        this.nomeres = nomeres;
    }

    public Acao(Long idAcao, String nomeres, Boolean ibovespa, List<Cotacao> cotacoes) {
        this.idAcao = idAcao;
        this.nomeres = nomeres;
        this.ibovespa = ibovespa;
        this.cotacoes = cotacoes;
    }

    // Property accessors
    public Long getIdAcao() {
        return this.idAcao;
    }

    public void setIdAcao(Long idAcao) {
        this.idAcao = idAcao;
    }

    public String getNomeres() {
        return this.nomeres;
    }

    public void setNomeres(String nomeres) {
        this.nomeres = nomeres;
    }

    public Boolean getIbovespa() {
        return this.ibovespa;
    }

    public void setIbovespa(Boolean ibovespa) {
        this.ibovespa = ibovespa;
    }

    public List<Cotacao> getCotacoes() {
        return this.cotacoes;
    }

    public void setCotacoes(List<Cotacao> cotacoes) {
        this.cotacoes = cotacoes;
    }

    public String getNomefull() {
        return nomefull;
    }

    public void setNomefull(String nomefull) {
        this.nomefull = nomefull;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((nomefull == null) ? 0 : nomefull.hashCode());
        result = prime * result + ((nomeres == null) ? 0 : nomeres.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Acao other = (Acao) obj;
        if (nomefull == null) {
            if (other.nomefull != null) {
                return false;
            }
        } else if (!nomefull.equals(other.nomefull)) {
            return false;
        }
        if (nomeres == null) {
            if (other.nomeres != null) {
                return false;
            }
        } else if (!nomeres.equals(other.nomeres)) {
            return false;
        }
        return true;
    }
}
