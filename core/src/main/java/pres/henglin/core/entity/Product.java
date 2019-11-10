package pres.henglin.core.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by linheng on 09/11/2019.
 */

@SuppressWarnings("serial")
@NoArgsConstructor
@Data
public class Product implements Serializable {
    private Long id;
    private String name;
    private String description;
}
