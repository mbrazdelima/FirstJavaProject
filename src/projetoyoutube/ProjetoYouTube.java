/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoyoutube;

/**
 *
 * @author mbrazdelima
 */
public class ProjetoYouTube {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Video v = new Video("CAadasd");
        
        Gafanhoto g = new Gafanhoto("truta", 12, "M", "truta123");      
        
        Visualizacao viz = new Visualizacao(g, v);
        
        viz.avaliar();
        
        System.out.println(viz.toString());
        
    }
    
}
