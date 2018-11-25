package com.garethwestern.mapstruct.dto;

import java.util.Set;

public class OrganisationDto {

    private String name;
    private AbstractOrgTypeDto abstractOrgType;
    private Set<AbstractOrgTypeDto> abstractOrgTypeSet;

    public OrganisationDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AbstractOrgTypeDto getAbstractOrgType() {
        return abstractOrgType;
    }

    public void setAbstractOrgType(AbstractOrgTypeDto abstractOrgType) {
        this.abstractOrgType = abstractOrgType;
    }

    public Set<AbstractOrgTypeDto> getAbstractOrgTypeSet() {
        return abstractOrgTypeSet;
    }

    public void setAbstractOrgTypeSet(Set<AbstractOrgTypeDto> abstractOrgTypeSet) {
        this.abstractOrgTypeSet = abstractOrgTypeSet;
    }
}
