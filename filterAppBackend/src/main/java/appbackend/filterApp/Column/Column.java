package appbackend.filterApp.Column;

import lombok.*;

import javax.persistence.*;


@Entity
@Table(name = "tabela_testowa")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Column {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private int id;

    @NonNull
    private String kolumna1;

    @NonNull
    private String kolumna2;

    @NonNull
    private String kolumna3;

    @NonNull
    private int kolumna4;


}
