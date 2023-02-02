package model.entities;


import java.time.LocalDateTime;
import java.util.Date;

public class Log {
    private String nome;
    private Date moment;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Date getDateTime() {
        return moment;
    }
    public void setDateTime(Date dateTime) {
        this.moment = dateTime;
    }
    public Log(String nome, Date dateTime) {
        this.nome = nome;
        this.moment = dateTime;
    }
    @Override
    public String toString() {
        return  nome +  moment ;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Log other = (Log) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }

    
}
