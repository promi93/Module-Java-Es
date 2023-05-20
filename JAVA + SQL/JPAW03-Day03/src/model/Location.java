package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
@Entity
@Table(name="persona")
@NamedQuery(name = "findAllEventi", query = "SELECT loc FROM Location loc")
public class Location {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(nullable = false)
        private Integer id; 

        @Column(nullable = false)
        private String nome; 

        @Column(nullable = false)
        private String citta;

        public Location() {
            super();
        }

        public Location(String nome, String citta) {
            super();
            this.nome = nome;
            this.citta = citta;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getCitta() {
            return citta;
        }

        public void setCitta(String citta) {
            this.citta = citta;
        }

        @Override
        public String toString() {
            return "Location [id=" + id + ", nome=" + nome + ", citta=" + citta + "]";
        } 


}