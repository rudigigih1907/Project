package jpa.entitas;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.entitas.Buku;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-02-21T08:13:27")
@StaticMetamodel(Peminjam.class)
public class Peminjam_ { 

    public static volatile SingularAttribute<Peminjam, String> jenisBuku;
    public static volatile SingularAttribute<Peminjam, Date> tanggalKembali;
    public static volatile SingularAttribute<Peminjam, String> penulis;
    public static volatile SingularAttribute<Peminjam, String> noTelepon;
    public static volatile SingularAttribute<Peminjam, Buku> idJudulBuku;
    public static volatile SingularAttribute<Peminjam, Date> tanggalPinjam;
    public static volatile SingularAttribute<Peminjam, Integer> id;
    public static volatile SingularAttribute<Peminjam, String> namaPeminjam;

}