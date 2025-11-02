package com.telcomate.TelcoMate.config;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.IOException;
import java.net.URI;

@Component
public class CustomLogoutHandler extends SecurityContextLogoutHandler {
    private final ClientRegistrationRepository clientRegistrationRepository;

    public CustomLogoutHandler(ClientRegistrationRepository clientRegistrationRepository) {
        this.clientRegistrationRepository = clientRegistrationRepository;
    }

    @Override
    public void logout(HttpServletRequest request,
                       HttpServletResponse response,
                       Authentication authentication) {
        super.logout(request, response, authentication);
        //Send request to Azure to logout
        //1. Get logout Endpoint
        String logoutEndpoint=(String)clientRegistrationRepository.findByRegistrationId("azure-dev")
                .getProviderDetails()
                .getConfigurationMetadata()
                .get("end_session_endpoint");

        //2. Generate logout URL
        String logoutUri = UriComponentsBuilder
                .fromUriString(logoutEndpoint)
                .encode()
                .toUriString();



        //3. Send request to logout URL
        try {
            response.sendRedirect(logoutUri);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
