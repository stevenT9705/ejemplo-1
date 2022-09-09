public class GeneradorVertebrados {
    public static Vertebrado[] generarArrayVertebrados(){
        Vertebrado[] miVertebrados = new Vertebrado[4];
        miVertebrados[0] = new Vertebrado("camello", "Mamifero"); 
        miVertebrados[1] = new Vertebrado("vaca", "Mamifero");
        miVertebrados[2] = new Vertebrado("Tiburón", "Pez"); 
        
        return miVertebrados;
    }
}
