package com.viswekshal.atheneumcontroller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.modules.junit4.PowerMockRunnerDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.viswekshal.atheneum.common.model.User;
import com.viswekshal.atheneum.common.security.services.UserService;
import com.viswekshal.atheneum.controller.BooksController;

@RunWith(PowerMockRunner.class)
@PowerMockRunnerDelegate(SpringRunner.class)
@WebMvcTest(value = BooksController.class /* , secure = false */)
//@PrepareForTest({ CacheFacade.class, SessionCreator.class, OAuthTokenHandlerService.class })
public class BooksControllerTest {
	@Autowired
	private MockMvc mockMvc;

	@MockBean
	public UserService userService;

	@Test
	public void testInsertGenericMessage() throws Exception {
		
		User user = new User();

//		Mockito.when(userService.createUser(Mockito.anyObject()).thenReturn(user);
//
//		String inputMessageJson = "{\"message\":\"Forecast Attainment\",\"categoryId\":\"PRODUCTION_DEPLOYMENT\","
//				+ "\"messageDisplayStartTime\":\"2020-01-02 23:13:45\",\"messageDisplayEndTime\":\"2020-01-20\","
//				+ "\"messagePriority\":\"HIGH\"}";
//
//		RequestBuilder requestBuilder = MockMvcRequestBuilders.post("/v1/generic-message")
//				.accept(MediaType.APPLICATION_JSON).content(inputMessageJson).contentType(MediaType.APPLICATION_JSON);
//
//		((MockHttpServletRequestBuilder) requestBuilder).header("Authorization", "Bearer abcdef");
//
//		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
//
//		assertEquals("Success", result.getResponse().getContentAsString());
	}
}