package koreatech.cse.domain.oauth2.toilet;

/**
 * Created by HYERIM on 2016-11-28.
 */
public class Item {
    private String SLAVENO;

    private String LAT;

    private String HNR_NAM;

    private String MTC_AT;

    private String CREAT_DE;

    private String MASTERNO;

    private String GU_NM;

    private String LNG;

    private String NEADRES_NM;

    private String OBJECTID;

    public String getSLAVENO ()
    {
        return SLAVENO;
    }

    public void setSLAVENO (String SLAVENO)
    {
        this.SLAVENO = SLAVENO;
    }

    public String getLAT ()
    {
        return LAT;
    }

    public void setLAT (String LAT)
    {
        this.LAT = LAT;
    }

    public String getHNR_NAM ()
    {
        return HNR_NAM;
    }

    public void setHNR_NAM (String HNR_NAM)
    {
        this.HNR_NAM = HNR_NAM;
    }

    public String getMTC_AT ()
    {
        return MTC_AT;
    }

    public void setMTC_AT (String MTC_AT)
    {
        this.MTC_AT = MTC_AT;
    }

    public String getCREAT_DE ()
    {
        return CREAT_DE;
    }

    public void setCREAT_DE (String CREAT_DE)
    {
        this.CREAT_DE = CREAT_DE;
    }

    public String getMASTERNO ()
    {
        return MASTERNO;
    }

    public void setMASTERNO (String MASTERNO)
    {
        this.MASTERNO = MASTERNO;
    }

    public String getGU_NM ()
    {
        return GU_NM;
    }

    public void setGU_NM (String GU_NM)
    {
        this.GU_NM = GU_NM;
    }

    public String getLNG ()
    {
        return LNG;
    }

    public void setLNG (String LNG)
    {
        this.LNG = LNG;
    }

    public String getNEADRES_NM ()
    {
        return NEADRES_NM;
    }

    public void setNEADRES_NM (String NEADRES_NM)
    {
        this.NEADRES_NM = NEADRES_NM;
    }

    public String getOBJECTID ()
    {
        return OBJECTID;
    }

    public void setOBJECTID (String OBJECTID)
    {
        this.OBJECTID = OBJECTID;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [SLAVENO = "+SLAVENO+", LAT = "+LAT+", HNR_NAM = "+HNR_NAM+", MTC_AT = "+MTC_AT+", CREAT_DE = "+CREAT_DE+", MASTERNO = "+MASTERNO+", GU_NM = "+GU_NM+", LNG = "+LNG+", NEADRES_NM = "+NEADRES_NM+", OBJECTID = "+OBJECTID+"]";
    }
}
