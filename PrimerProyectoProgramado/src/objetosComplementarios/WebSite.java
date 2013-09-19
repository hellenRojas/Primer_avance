/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosComplementarios;

/**
 *
 * @author Hellen Rojas and Laurenth Chaves
 */

//Class name: "WebSite"
//Every website has notes
public class WebSite {
    private String apuntes;

    public WebSite(String apuntes) {
        this.apuntes = apuntes;
    }

    // Returns the webSite's notes
    public String getApuntes() {
        return apuntes;
    }
    // Sets the webSite's notes
    public void setApuntes(String apuntes) {
        this.apuntes = apuntes;
    }
}
