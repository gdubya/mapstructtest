package com.garethwestern.mapstruct.mapper;

import com.garethwestern.mapstruct.dto.AbstractOrgTypeDto;
import com.garethwestern.mapstruct.dto.OrgType1Dto;
import com.garethwestern.mapstruct.dto.OrgType2Dto;
import com.garethwestern.mapstruct.dto.OrgType3Dto;
import com.garethwestern.mapstruct.dto.OrganisationDto;
import com.garethwestern.mapstruct.entity.AbstractOrgType;
import com.garethwestern.mapstruct.entity.OrgType1;
import com.garethwestern.mapstruct.entity.OrgType2;
import com.garethwestern.mapstruct.entity.OrgType3;
import com.garethwestern.mapstruct.entity.Organisation;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrganisationMapper {

    OrganisationMapper INSTANCE = Mappers.getMapper( OrganisationMapper.class );

    OrganisationDto orgToOrgDto(Organisation organisation);

    default AbstractOrgTypeDto orgTypeToOrgTypeDto(AbstractOrgType abstractOrgType) {
        if (abstractOrgType instanceof OrgType1) {
            return new OrgType1Dto();
        } else if (abstractOrgType instanceof OrgType2) {
            return new OrgType2Dto();
        } else if (abstractOrgType instanceof OrgType3) {
            return new OrgType3Dto();
        }
        return null;
    }
}
