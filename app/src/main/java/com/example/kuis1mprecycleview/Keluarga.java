package com.example.kuis1mprecycleview;

public class Keluarga {
    private String nama;
    private String status;
    private String ttl;
    private Integer foto;

    Keluarga(String nama, String status, String ttl, Integer foto) {
        this.nama = nama;
        this.status = status;
        this.ttl = ttl;
        this.foto = foto;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTtl() {
        return ttl;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    public Integer getFoto() {
        return foto;
    }

    public void setFoto(Integer foto) {
        this.foto = foto;
    }
}
