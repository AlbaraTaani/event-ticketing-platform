package com.albara.event_ticketing_platform.services;

import com.devtiro.tickets.domain.entities.TicketValidation;

import java.util.UUID;

public interface TicketValidationService {
  TicketValidation validateTicketByQrCode(UUID qrCodeId);
  TicketValidation validateTicketManually(UUID ticketId);
}
