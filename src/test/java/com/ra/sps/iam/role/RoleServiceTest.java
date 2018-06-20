package com.ra.sps.iam.role;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class RoleServiceTest {
	
	@InjectMocks
	RoleService roleService;
	
	@Mock
	RoleRepository roleRepository;
	
	@Test
	public void findById_Returns_Null_With_Null_Input() {
		assertEquals(null, roleService.findById(null));
	}
	
	@Test
	public void findById_Returns_Null_For_NonExistant_User() {
		when(roleRepository.findById(1L)).thenReturn(null);
		assertEquals(null, roleService.findById(1L));
	}

}
