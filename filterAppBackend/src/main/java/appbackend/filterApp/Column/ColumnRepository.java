package appbackend.filterApp.Column;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ColumnRepository extends JpaRepository<Column, Long> {


    @Query(value = "SELECT x.* " +
            " FROM tabela_testowa x " +
            " JOIN (SELECT t.kolumna1 " +
            " FROM tabela_testowa t " +
            " GROUP BY t.kolumna1 " +
            " HAVING COUNT(t.kolumna1) > 1) y ON y.kolumna1 = x.kolumna1", nativeQuery = true)
    public List<Column> findDuplicates1();

    @Query(value = "SELECT x.* " +
            " FROM tabela_testowa x " +
            " JOIN (SELECT t.kolumna2 " +
            " FROM tabela_testowa t " +
            " GROUP BY t.kolumna2 " +
            " HAVING COUNT(t.kolumna2) > 1) y ON y.kolumna2 = x.kolumna2", nativeQuery = true)
    public List<Column> findDuplicates2();

    @Query(value = "SELECT x.* " +
            " FROM tabela_testowa x " +
            " JOIN (SELECT t.kolumna3 " +
            " FROM tabela_testowa t " +
            " GROUP BY t.kolumna3 " +
            " HAVING COUNT(t.kolumna3) > 1) y ON y.kolumna3 = x.kolumna3", nativeQuery = true)
    public List<Column> findDuplicates3();

    @Query(value = "SELECT x.* " +
            " FROM tabela_testowa x " +
            " JOIN (SELECT t.kolumna4 " +
            " FROM tabela_testowa t " +
            " GROUP BY t.kolumna4 " +
            " HAVING COUNT(t.kolumna4) > 1) y ON y.kolumna4 = x.kolumna4", nativeQuery = true)
    public List<Column> findDuplicates4();
}
