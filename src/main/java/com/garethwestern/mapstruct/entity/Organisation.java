package com.garethwestern.mapstruct.entity;


import java.util.Set;

public class Organisation {

    private String name;
    private AbstractOrgType abstractOrgType;
    private Set<AbstractOrgType> abstractOrgTypeSet;

    public Organisation() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AbstractOrgType getAbstractOrgType() {
        return abstractOrgType;
    }

    public void setAbstractOrgType(AbstractOrgType abstractOrgType) {
        this.abstractOrgType = abstractOrgType;
    }

    public Set<AbstractOrgType> getAbstractOrgTypeSet() {
        return abstractOrgTypeSet;
    }

    public void setAbstractOrgTypeSet(Set<AbstractOrgType> abstractOrgTypeSet) {
        this.abstractOrgTypeSet = abstractOrgTypeSet;
    }
}
