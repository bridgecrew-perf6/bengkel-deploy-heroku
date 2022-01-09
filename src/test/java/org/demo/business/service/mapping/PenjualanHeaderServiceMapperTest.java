/*
 * Created on 25 Jul 2021 ( Time 02:07:43 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package org.demo.business.service.mapping;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;
import org.demo.bean.PenjualanHeader;
import org.demo.bean.jpa.PenjualanHeaderEntity;
import org.demo.test.MockValues;

/**
 * Test : Mapping between entity beans and display beans.
 */
public class PenjualanHeaderServiceMapperTest {

	private PenjualanHeaderServiceMapper penjualanHeaderServiceMapper;

	private static ModelMapper modelMapper = new ModelMapper();

	private MockValues mockValues = new MockValues();
	
	
	@BeforeClass
	public static void setUp() {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
	}
	
	@Before
	public void before() {
		penjualanHeaderServiceMapper = new PenjualanHeaderServiceMapper();
		penjualanHeaderServiceMapper.setModelMapper(modelMapper);
	}
	
	/**
	 * Mapping from 'PenjualanHeaderEntity' to 'PenjualanHeader'
	 * @param penjualanHeaderEntity
	 */
	@Test
	public void testMapPenjualanHeaderEntityToPenjualanHeader() {
		// Given
		PenjualanHeaderEntity penjualanHeaderEntity = new PenjualanHeaderEntity();
		penjualanHeaderEntity.setTanggal(mockValues.nextDate());
		penjualanHeaderEntity.setTotal(mockValues.nextBigDecimal());
		penjualanHeaderEntity.setNamaMekanik(mockValues.nextString(45));
		penjualanHeaderEntity.setOngkosMekanik(mockValues.nextBigDecimal());
		
		// When
		PenjualanHeader penjualanHeader = penjualanHeaderServiceMapper.mapPenjualanHeaderEntityToPenjualanHeader(penjualanHeaderEntity);
		
		// Then
		assertEquals(penjualanHeaderEntity.getTanggal(), penjualanHeader.getTanggal());
		assertEquals(penjualanHeaderEntity.getTotal(), penjualanHeader.getTotal());
		assertEquals(penjualanHeaderEntity.getNamaMekanik(), penjualanHeader.getNamaMekanik());
		assertEquals(penjualanHeaderEntity.getOngkosMekanik(), penjualanHeader.getOngkosMekanik());
	}
	
	/**
	 * Test : Mapping from 'PenjualanHeader' to 'PenjualanHeaderEntity'
	 */
	@Test
	public void testMapPenjualanHeaderToPenjualanHeaderEntity() {
		// Given
		PenjualanHeader penjualanHeader = new PenjualanHeader();
		penjualanHeader.setTanggal(mockValues.nextDate());
		penjualanHeader.setTotal(mockValues.nextBigDecimal());
		penjualanHeader.setNamaMekanik(mockValues.nextString(45));
		penjualanHeader.setOngkosMekanik(mockValues.nextBigDecimal());

		PenjualanHeaderEntity penjualanHeaderEntity = new PenjualanHeaderEntity();
		
		// When
		penjualanHeaderServiceMapper.mapPenjualanHeaderToPenjualanHeaderEntity(penjualanHeader, penjualanHeaderEntity);
		
		// Then
		assertEquals(penjualanHeader.getTanggal(), penjualanHeaderEntity.getTanggal());
		assertEquals(penjualanHeader.getTotal(), penjualanHeaderEntity.getTotal());
		assertEquals(penjualanHeader.getNamaMekanik(), penjualanHeaderEntity.getNamaMekanik());
		assertEquals(penjualanHeader.getOngkosMekanik(), penjualanHeaderEntity.getOngkosMekanik());
	}

}