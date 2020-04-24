package guru.springframework.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Copyright: Copyright ©2020 Description: An optional description... Created on : 24/04/2020
 *
 * @author KBarry1
 */
@Entity
public class Uom {
    @Id
    private Long Id;
    private String unitOfMeasure;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }
}
