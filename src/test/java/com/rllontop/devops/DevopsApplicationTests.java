package com.rllontop.devops;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@AutoConfigureMockMvc
@SpringBootTest
class DevopsApplicationTests {

	@Test
	public void getRequestShouldReturn_ok_200(@Autowired MockMvc mockMvc) throws Exception {

		mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/DevOps"))
				.andExpect(MockMvcResultMatchers.status().isForbidden());
	}

	/*@Test
	public void postRequestShouldReturn_ok_200(@Autowired MockMvc mockMvc) throws Exception {

		mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/DevOps")
				.content("{\"message\" : \"This is a test\",\"to\": \"Juan Perez\",\"from\": \"Rita Asturisa\",\"timeToLifeSec\" : 45}"))
				.andExpect(MockMvcResultMatchers.status().isCreated());
	}*/

	@Test
	public void putRequestShouldReturn_notallowed_405(@Autowired MockMvc mockMvc) throws Exception {

		mockMvc.perform(MockMvcRequestBuilders.put("/api/v1/DevOps")
				.content("{\"name\": \"demo\"}"))
				.andExpect(MockMvcResultMatchers.status().isForbidden());
	}

	@Test
	public void deleteRequestShouldReturn_notallowed_405(@Autowired MockMvc mockMvc) throws Exception {

		mockMvc.perform(MockMvcRequestBuilders.delete("/api/v1/DevOps")
				.content("{\"name\": \"demo\"}"))
				.andExpect(MockMvcResultMatchers.status().isForbidden());
	}

	@Test
	public void patchRequestShouldReturn_notallowed_405(@Autowired MockMvc mockMvc) throws Exception {

		mockMvc.perform(MockMvcRequestBuilders.patch("/api/v1/DevOps")
				.content("{\"name\": \"demo\"}"))
				.andExpect(MockMvcResultMatchers.status().isForbidden());
	}

	/*@Test
	public void optionsRequestShouldReturn_notallowed_405(@Autowired MockMvc mockMvc) throws Exception {

		mockMvc.perform(MockMvcRequestBuilders.options("/api/v1/DevOps"))
				.andExpect(MockMvcResultMatchers.status().isMethodNotAllowed());
	}*/


}
