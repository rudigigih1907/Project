/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.entitas;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rudigigihprabowo
 */
@Entity
@Table(name = "peminjam")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Peminjam.findAll", query = "SELECT p FROM Peminjam p"),
    @NamedQuery(name = "Peminjam.findById", query = "SELECT p FROM Peminjam p WHERE p.id = :id"),
    @NamedQuery(name = "Peminjam.findByNamaPeminjam", query = "SELECT p FROM Peminjam p WHERE p.namaPeminjam = :namaPeminjam"),
    @NamedQuery(name = "Peminjam.findByPenulis", query = "SELECT p FROM Peminjam p WHERE p.penulis = :penulis"),
    @NamedQuery(name = "Peminjam.findByJenisBuku", query = "SELECT p FROM Peminjam p WHERE p.jenisBuku = :jenisBuku"),
    @NamedQuery(name = "Peminjam.findByNoTelepon", query = "SELECT p FROM Peminjam p WHERE p.noTelepon = :noTelepon"),
    @NamedQuery(name = "Peminjam.findByTanggalPinjam", query = "SELECT p FROM Peminjam p WHERE p.tanggalPinjam = :tanggalPinjam"),
    @NamedQuery(name = "Peminjam.findByTanggalKembali", query = "SELECT p FROM Peminjam p WHERE p.tanggalKembali = :tanggalKembali")})
public class Peminjam implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nama_peminjam")
    private String namaPeminjam;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "penulis")
    private String penulis;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "jenis_buku")
    private String jenisBuku;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "no_telepon")
    private String noTelepon;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tanggal_pinjam")
    @Temporal(TemporalType.DATE)
    private Date tanggalPinjam;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tanggal_kembali")
    @Temporal(TemporalType.DATE)
    private Date tanggalKembali;
    @JoinColumn(name = "id_judul_buku", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Buku idJudulBuku;

    public Peminjam() {
    }

    public Peminjam(Integer id) {
        this.id = id;
    }

    public Peminjam(Integer id, String namaPeminjam, String penulis, String jenisBuku, String noTelepon, Date tanggalPinjam, Date tanggalKembali) {
        this.id = id;
        this.namaPeminjam = namaPeminjam;
        this.penulis = penulis;
        this.jenisBuku = jenisBuku;
        this.noTelepon = noTelepon;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = tanggalKembali;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNamaPeminjam() {
        return namaPeminjam;
    }

    public void setNamaPeminjam(String namaPeminjam) {
        this.namaPeminjam = namaPeminjam;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getJenisBuku() {
        return jenisBuku;
    }

    public void setJenisBuku(String jenisBuku) {
        this.jenisBuku = jenisBuku;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }

    public Date getTanggalPinjam() {
        return tanggalPinjam;
    }

    public void setTanggalPinjam(Date tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }

    public Date getTanggalKembali() {
        return tanggalKembali;
    }

    public void setTanggalKembali(Date tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }

    public Buku getIdJudulBuku() {
        return idJudulBuku;
    }

    public void setIdJudulBuku(Buku idJudulBuku) {
        this.idJudulBuku = idJudulBuku;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Peminjam)) {
            return false;
        }
        Peminjam other = (Peminjam) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.entitas.Peminjam[ id=" + id + " ]";
    }
    
}
