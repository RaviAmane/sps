package com.ra.sps.iam.role;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringRunner.class)
@WebMvcTest(RoleController.class)
public class RoleControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private RoleService roleService;
	
	private List<Role> roles = new ArrayList<Role>();
	
	@BeforeClass
	public void beforeClass() {
		
	}
	
	@Test
	public void Call_To_GET_Should_Return() throws Exception {
		
		when(roleService.findAll()).thenReturn(new ArrayList<Role>());
		
		RequestBuilder request = MockMvcRequestBuilders.get("/roles");
		mockMvc.perform(request)
			.andExpect(status().isOk())
			.andExpect(content().json("[]"));
	}

}
