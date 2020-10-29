
package gestionMenus.dto;


public class Menus {
    private String plato1;
    private String plato2;
    private String postre;

    public Menus(String plato1, String plato2, String postre) {
        this.plato1 = plato1;
        this.plato2 = plato2;
        this.postre = postre;
    }

    public String getPlato1() {
        return plato1;
    }

    public void setPlato1(String plato1) {
        this.plato1 = plato1;
    }

    public String getPlato2() {
        return plato2;
    }

    public void setPlato2(String plato2) {
        this.plato2 = plato2;
    }

    public String getPostre() {
        return postre;
    }

    public void setPostre(String postre) {
        this.postre = postre;
    }
    
    public String[] toArrayString(){
        String[] s = new String[3];
        s[0]= plato1;
        s[1]=plato2;
        s[2]=postre;
        return s;
        
    }
    
    
}
