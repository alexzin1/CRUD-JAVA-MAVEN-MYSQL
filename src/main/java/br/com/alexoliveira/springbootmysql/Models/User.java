package br.com.alexoliveira.springbootmysql.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //diz que é uma TABELA para o banco de dados MYSQL
public class User {
    @Id //DIZ QUE É UM ID UNICO PARA CADA USUARIO QUE A DB TEM Q CRIAR
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    @Column  // diz que cada uma dessas variaveis sera uma coluna na database
    private String nome;

    @Column
    private int idade;

    @Column
    private String ocupacao;

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getOcupacao() {
        return this.ocupacao;
    }

    public void setOcupacao(String ocupacao) {
        this.ocupacao = ocupacao;
    }

}
