//created by 21343034_Rani Nabilla Putri
package Job12Lat6_Encapsulation;

public class EncapsulationBuah {
    //Data members of class EncapsulationBuah
    private String namaBuah;
    private String hargaBuah;
    private String warnaBuah;

    //Declaration of constructor
    public EncapsulationBuah(String namaBuah, String hargaBuah, String warnaBuah)
    {
        this.namaBuah = namaBuah;
        this.hargaBuah = hargaBuah;
        this.warnaBuah = warnaBuah;
    }

    //Declarating Setter of all fields
    public void setName(String namaBuah){
        this.namaBuah = namaBuah;
    }
    public void setPrice(String hargaBuah){
        this.hargaBuah = hargaBuah;
    }
    public void setColor(String warnaBuah){
        this.warnaBuah = warnaBuah;
    }

    //Declarating Getter for all fields
    public String getName()
    {
        return namaBuah;
    }
    public String getPrice()
    {
        return hargaBuah;
    }
    public String getColor()
    {
        return warnaBuah;
    }
}