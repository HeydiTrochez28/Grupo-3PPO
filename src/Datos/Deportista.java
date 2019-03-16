package Datos;


public class Deportista extends Datos {

    public String nombre;
    public String perfil;
    public String deporte;
    public int edad;
    
    
    public Deportista()
    {
        this.nombre="Juan";
        this.perfil="";
	this.deporte="Béisbol";
        this.edad=23;
    }

    public Deportista(String n, String d, String p, int e)
    {
        this.nombre=n;
        this.perfil=p;
	this.deporte=d;
        this.edad=e;
    }

   public void setDeporte(String d){
        this.deporte=d;
    }
   public String getDeporte(){
        this.deporte;
    }

   public void setnombre(String n){
        this.nombre=n;
    }
   public String getnombre(){
        this.nombre;
    }

    public void setedad(int e){
        this.edad=e;
    }
    public int getedad(){
        return this.edad;
    }

    public void setperfil(String p){
        this.perfil=p;
    }

    public String getperfil(){
        return this.perfil;
    }
} 
