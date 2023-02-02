package com.glucoseguardian.webbackend.application.service.auth;

import com.glucoseguardian.webbackend.application.service.assunzionefarmaco.AssunzioneFarmacoServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Implementazione di {@link AbstractAuthService} che restituisce {@link AuthServiceConcrete}.
 */
@Service
public class FinalAuthService extends AbstractAuthService {
  @Autowired
  @Qualifier("AuthServiceConcrete")
  AuthServiceInterface authServiceService;

  @Override
  public AuthServiceInterface getImplementation() {
    return authServiceService;
  }
}
