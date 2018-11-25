package com.garethwestern.mapstruct.mapper;

import com.garethwestern.mapstruct.dto.OrgType1Dto;
import com.garethwestern.mapstruct.dto.OrgType2Dto;
import com.garethwestern.mapstruct.dto.OrgType3Dto;
import com.garethwestern.mapstruct.dto.OrganisationDto;
import com.garethwestern.mapstruct.entity.OrgType1;
import com.garethwestern.mapstruct.entity.OrgType2;
import com.garethwestern.mapstruct.entity.OrgType3;
import com.garethwestern.mapstruct.entity.Organisation;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class OrganisationMapperTest {

    @Test
    void shouldMapOrgToOrgType1Dto() {
        //given
        Organisation org = new Organisation();
        org.setName("Org1");
        org.setAbstractOrgType(new OrgType1());

        //when
        OrganisationDto orgDto = OrganisationMapper.INSTANCE.orgToOrgDto(org);

        //then
        assertNotNull(orgDto);
        assertEquals("Org1", orgDto.getName());
        assertNotNull(orgDto.getAbstractOrgType());
        assertTrue(orgDto.getAbstractOrgType() instanceof OrgType1Dto);
    }

    @Test
    void shouldMapOrgToOrgType2Dto() {
        //given
        Organisation org = new Organisation();
        org.setName("Org2");
        org.setAbstractOrgType(new OrgType2());

        //when
        OrganisationDto orgDto = OrganisationMapper.INSTANCE.orgToOrgDto(org);

        //then
        assertNotNull(orgDto);
        assertEquals("Org2", orgDto.getName());
        assertNotNull(orgDto.getAbstractOrgType());
        assertTrue(orgDto.getAbstractOrgType() instanceof OrgType2Dto);
    }

    @Test
    void shouldMapMultipleOrgTypes() {
        //given
        Organisation org = new Organisation();
        org.setName("Org3");
        org.setAbstractOrgTypeSet(Collections.singleton(new OrgType3()));

        //when
        OrganisationDto orgDto = OrganisationMapper.INSTANCE.orgToOrgDto(org);

        //then
        assertNotNull(orgDto);
        assertEquals("Org3", orgDto.getName());
        assertNotNull(orgDto.getAbstractOrgTypeSet());
        assertEquals(1, orgDto.getAbstractOrgTypeSet().size());
        assertTrue(orgDto.getAbstractOrgTypeSet().iterator().next() instanceof OrgType3Dto);
    }
}