package com.ideau.controlepatrimonio_api.model.Usuario.dto;

import java.time.LocalDateTime;

public record UsuarioPublicoDTO (
    String idUsuario,
    String username,
    String nomeCompleto,
    String email,
    String nomeCargo,
    LocalDateTime dataCriacao,
    String ativo
) {}
