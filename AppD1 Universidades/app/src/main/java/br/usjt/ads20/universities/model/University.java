package br.usjt.ads20.universities.model;

import java.io.Serializable;

/**
 * Nome: Mateus Santos Carvalho
 * RA: 818229525
 */

public class University implements Serializable {
    private int id;
    private String Name;
    private String Country;
    private String AlphaTwoCode;
    private String WebPage;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getAlphaTwoCode() {
        return AlphaTwoCode;
    }

    public void setAlphaTwoCode(String alphaTwoCode) {
        AlphaTwoCode = alphaTwoCode;
    }

    public String getWebPage() {
        return WebPage;
    }

    public void setWebPage(String webPage) {
        WebPage = webPage;
    }

    @Override
    public String toString() {
        return "University{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", Country='" + Country + '\'' +
                ", AlphaTwoCode='" + AlphaTwoCode + '\'' +
                ", WebPage='" + WebPage + '\'' +
                '}';
    }
}
