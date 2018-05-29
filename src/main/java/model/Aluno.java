package model;

import entities.TelefoneEntity;

import java.util.List;

/**
 * Created by NeriDev on 29/05/2018.
 */
public class Aluno {

    private Long id;
    private String nome;
    private Long matricula;
    private List<TelefoneEntity> telefones;

    public Aluno(){

    }

    public Aluno(Long id, String nome, Long matricula, List<TelefoneEntity> telefones) {
        this.id = id;
        this.nome = nome;
        this.matricula = matricula;
        this.telefones = telefones;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public List<TelefoneEntity> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<TelefoneEntity> telefones) {
        this.telefones = telefones;
    }
}
