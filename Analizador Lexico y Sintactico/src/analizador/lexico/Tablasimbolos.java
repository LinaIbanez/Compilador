/*
 * Ibañez Trejo Lina Celeste
 * COMPILADORES E INTÉRPRETES
 * Ramírez Fuentes Benito
 */

package analizador.lexico;

public class Tablasimbolos {
  int id;
  String nombre;
  String tokens;

   public Tablasimbolos(int id, String nombre, String tokens) {
        this.id = id;
        this.nombre = nombre;
        this.tokens = tokens;
    } 

    Tablasimbolos(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTokens() {
        return tokens;
    }

    public void setTokens(String tokens) {
        this.tokens = tokens;
    }
      
}
