public class Censista {
    // Atributos
    private int dni, telefono, area, totalViviendas, cantCensada;
    private String provincia, ciudad;

    // Constructoras
    public Censista(int elDni, int elTelefono, String laProvincia, String laCiudad, int elArea, int elTotalViviendas,
            int laCantCensada) {
        this.dni = elDni;
        this.telefono = elTelefono;
        this.provincia = laProvincia;
        this.ciudad = laCiudad;
        this.area = elArea;
        this.totalViviendas = elTotalViviendas;
        this.cantCensada = laCantCensada;
    }

    // Constructoras con valores default
    public Censista(int elDni) {
        this.dni = elDni;
        this.telefono = 0;
        this.provincia = "";
        this.ciudad = "";
        this.area = 0;
        this.totalViviendas = 0;
        this.cantCensada = 0;
    }

    // Observadores
    public int getDni() {
        return this.dni;
    }

    public int getTelefono() {
        return this.telefono;
    }

    public String getProvincia() {
        return this.provincia;
    }

    public String getCiudad() {
        return this.ciudad;
    }

    public int getArea() {
        return this.area;
    }

    public int getTotalViviendas() {
        return this.totalViviendas;
    }

    public int getCantCensada() {
        return this.cantCensada;
    }

    // Modificadoras
    public void setTelefono(int elTelefono) {
        this.telefono = elTelefono;
    }

    public void setProvincia(String laProvincia) {
        this.provincia = laProvincia;
    }

    public void setCiudad(String laCiudad) {
        this.ciudad = laCiudad;
    }

    public void setArea(int elArea) {
        this.area = elArea;
    }

    public void setTotalViviendas(int elTotalViviendas) {
        this.totalViviendas = elTotalViviendas;
    }

    public void setCantCensada(int laCantCensada) {
        this.cantCensada = laCantCensada;
    }

    // Propias del tipo
    public boolean equals(Censista objeto) {
        return this.dni == objeto.getDni();
    }

    public String toString() {
        String cadena = "Dni: " + this.getDni() + "\nTelefono: " + this.telefono + "\nProvincia: " + this.provincia
                + "\nCiudad: " + this.ciudad + "\nArea: " + this.area + "\nTotal Viviendas: " + this.totalViviendas
                + "\nCantidad Censada: " + this.cantCensada;
        return cadena;
    }

    public int cantViviendas(){
        int cantViviendas = this.totalViviendas + this.cantCensada;
        return cantViviendas;
    }
}
