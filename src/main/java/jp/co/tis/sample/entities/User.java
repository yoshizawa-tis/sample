package jp.co.tis.sample.entities;

import java.io.Serializable;
import javax.validation.constraints.NotEmpty;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import lombok.Data;

@Data
@Table("names")
public class User implements Serializable {
    private static final long serialVersionUID = 6983966136404143661L;

    @Id
    private Integer key;

    @NotEmpty
    private String name;
}
